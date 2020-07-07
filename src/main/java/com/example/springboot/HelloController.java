package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello1() {
        return "Hello Spring Boot!";
    }
    @RequestMapping("/hi")
    public String hi1() {
        return "hi Spring Boot!";
    }
    @RequestMapping("/yangjin")
    public String yangjin() {
        List li=new ArrayList();
        li.add("123");
        li.add("456");
        for (int i=0;i<li.size();i++){
            System.out.print(li.get(i));
        }
        return "杨锦沙雕!";
    }
}
