package com.jia.demo.shell;

import com.jia.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by Jarris on 7/26/2018.
 */

@ShellComponent
public class SendMailShell {

    @Autowired
    private MailService mailService;

    @Value("${test.from}")
    private String from;

    @Value("${test.to}")
    private String to;

    @Value("${test.subject}")
    private String subject;

    @Value("${test.text}")
    private String text;

    @ShellMethod("Send Mail")
    public String sendMail() {
        System.out.println(">>>>>>>>>>>>>>>发送邮件测试<<<<<<<<<<<<<");
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(text);
        System.out.println("From: " + from);
        try{
            mailService.sendEmail(mailMessage);
        }catch (Exception e){
            return "发送测试邮件失败。";
        }
        return (">>>>>>>>>>>>>>>发送测试邮件成功<<<<<<<<<<<<<");
    }


    @ShellMethod("Say hi")
    public String sayHi(String name) {
        return String.format("Hi %s", name);
    }

    @ShellMethod("echo1")
    public String echo1(int a, @ShellOption("--boy")int b, int c) {
        return String.format("a = %d, b = %d, c = %d", a, b, c);
    }

    @ShellMethod(key = "default", value = "With default value")
    public void withDefault(@ShellOption(defaultValue = "Hello") final String value) {
        System.out.printf("Value: %s%n", value);
    }

    @ShellMethod("echo3")
    public String echo3(@ShellOption(arity = 3) Boolean[] numbers) {
        return String.format("a = %b, b = %b, c = %b", numbers[0], numbers[1], numbers[2]);
    }

    @ShellMethod("Number range")
    public String numberRange(@Min(10) @Max(100) int number) {
        return String.format("The number is %s", number);
    }
}