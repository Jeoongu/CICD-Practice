package com.aledma.cicdproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello(){
        return "안녕하세요, CI / CD 프로젝트입니다.\n" +
                "첫 workflow 파일 성공 및 완성했습니다.\n" +
                "docker-compose를 사용했습니다.\n" +
                "nginx도 사용해보겠습니다.";
    }
}

