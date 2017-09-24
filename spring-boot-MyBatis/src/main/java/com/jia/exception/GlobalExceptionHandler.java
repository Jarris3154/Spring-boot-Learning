package com.jia.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * 1. 加入注解@ControllerAdvice
 * 2. 添加异常处理方法,并在方法上添加@ExceptionHandler的注解
 * 3. 如果返回的是View，则返回为ModelAndView
 * 4. 如果返回的是数据，则加入@ResponseBody注解
 *
 */
//@ControllerAdvice
public class GlobalExceptionHandler {

    private static final String ERROR_MESSAGE="服务器繁忙，请稍后再试";

    //@ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandle(HttpServletRequest req, Exception e){
        return "对不起，服务器繁忙，请稍后再试";
        //return new ModelAndView("404");
    }
}
