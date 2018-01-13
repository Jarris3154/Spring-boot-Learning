package com.jia.gradesystem.controller;

import com.jia.gradesystem.message.LoginResponse;
import com.jia.gradesystem.model.Role;
import com.jia.gradesystem.model.User;
import com.jia.gradesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserManager {

    @Autowired
    private UserService userService;

    @RequestMapping("/login/checkLogin")
    public ModelAndView login(User user) {
        LoginResponse loginResponse = userService.loginCheck(user);
        ModelMap modelMap = new ModelMap();
        if(loginResponse == LoginResponse.Success) {
            if(loginResponse.getUser().getRole()== Role.管理员)
            return new ModelAndView("admin");
        }

        if (null == user.getRole() || "".equals(user.getRole())) {
            modelMap.put("message", "请选择用户类型");
        }else {
            modelMap.put("message", "Fail");
        }
            return new ModelAndView("/login", modelMap);
        }


}
