package com.kh.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DonghangController {

    /*
    @GetMapping("/index")
    public String index() {

        System.out.println("index메서드 테스트..");


        return "test2";
    }
    */


    @GetMapping("/donghangMain") //http://localhost:8070/donghangMain
    public String donghangMain() {

        System.out.println("donghangMain 테스트..");


        return "donghang/donghangMain";
    }

    @GetMapping("/donghangMain2") //http://localhost:8070/donghangMain2
    public String donghangMain2() {

        System.out.println("donghangMain2 테스트..");


        return "donghang/donghangMain2";
    }



}
