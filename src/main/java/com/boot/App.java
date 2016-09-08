package com.boot;

import com.boot.controller.StringController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        StringController sc = new StringController();
        SpringApplication.run(App.class, args);
        System.out.println(sc.text());
    }
}
