package com.example.docker_moon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class BoardController {
    @GetMapping("hello")
    public List<String> Hello(){



        return Arrays.asList("테스트 확인");
    }
}
