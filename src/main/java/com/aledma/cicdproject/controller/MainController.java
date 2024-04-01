package com.aledma.cicdproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello(){
        return "안녕하세요, CI / CD 프로젝트입니다.";
    }
}

