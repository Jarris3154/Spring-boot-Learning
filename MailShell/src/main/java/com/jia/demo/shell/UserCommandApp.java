package com.jia.demo.shell;

import com.jia.demo.model.User;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * Created by Jarris on 7/26/2018.
 */
@ShellComponent
public class UserCommandApp {
    @ShellMethod("User")
    public void user(final User user) {
        if (user != null) {
            System.out.println(user.getName());
        } else {
            System.out.println("User not found");
        }
    }
}