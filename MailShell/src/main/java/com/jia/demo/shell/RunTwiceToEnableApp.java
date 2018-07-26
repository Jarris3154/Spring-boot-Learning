package com.jia.demo.shell;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * Created by Jarris on 7/26/2018.
 */
@ShellComponent
public class RunTwiceToEnableApp {
    private boolean run = false;

    @ShellMethod("Run once")
    public void runOnce() {
        this.run = true;

    }

    @ShellMethod("Run again")
    public void runAgain() {
        System.out.println("Run!");
    }

    public Availability runAgainAvailability() {
        return run ? Availability.available()
                : Availability.unavailable("You should run runOnce first!");
    }
}
