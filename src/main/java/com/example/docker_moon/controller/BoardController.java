package com.example.docker_moon.controller;

import com.example.docker_moon.dto.BoardDto;
import com.example.docker_moon.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    @GetMapping("hello")
    public List<BoardDto> Hello(){
        List<BoardDto> board = boardService.list();
        return board;
    }

    @Data
    public class RestHandler {
        int handler;
    }

//    @GetMapping("handler")
//    public @ResponseBody RestHandler handler(){
//        //
//
//    }







}
