package com.jia.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication( DemoApplication.class );
        application.setWebEnvironment( false );
        SpringApplication.exit( application.run( args ) );
    }
}
