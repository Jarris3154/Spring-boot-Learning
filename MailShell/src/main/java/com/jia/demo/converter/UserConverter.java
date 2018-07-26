package com.jia.demo.converter;

import com.jia.demo.model.User;
import com.jia.demo.service.UserService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by Jarris on 7/26/2018.
 */
@Component
public class UserConverter implements Converter<String, User> {

    private final UserService userService = new UserService();

    @Override
    public User convert(String source) {
        return userService.findUser(source);
    }
}