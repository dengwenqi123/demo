package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {
    public static Integer helloWorld02() {
        System.out.println("hello world");

        System.out.println("sdjsld");
        ArrayList<String> list = new ArrayList<>();

        String str = new String();


        System.out.println(124);
        return 0;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void helloWorld() {

        helloWorld02();

    }

}
