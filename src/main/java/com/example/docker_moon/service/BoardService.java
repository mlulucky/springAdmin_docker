package com.example.docker_moon.service;

import com.example.docker_moon.dto.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> list();
    int register(BoardDto board);
    int modify(BoardDto board);
    int delete(int bId);
}
