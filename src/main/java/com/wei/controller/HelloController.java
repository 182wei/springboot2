package com.wei.controller;

import com.wei.Entiy.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    private People people;
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        System.out.println("hello1");
        System.out.println("master test");
        System.out.println("hot-fix");
         System.out.println("pull-test");
         System.out.println("gitee pull-test");
        return "hello spring boot。"+name;
    }

//    @RequestMapping("/people")
//    public People h(){
//        People people = new People();
//        people.setName("张三");
//        people.setAge(18);
//        return people;
//    }
    @RequestMapping("/p")
    public People people(){
        log.info("信息");
        return people;
    }


}
