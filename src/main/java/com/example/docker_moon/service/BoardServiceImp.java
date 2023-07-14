package com.example.docker_moon.service;

import com.example.docker_moon.dto.BoardDto;
import com.example.docker_moon.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardServiceImp implements BoardService{
    private BoardMapper boardMapper;

    @Override
    public List<BoardDto> list() {
        List<BoardDto> board = boardMapper.findAll();
        return board;
    }

    @Override
    public int register(BoardDto board) {
        int register = boardMapper.insertOne(board);
        return register;
    }

    @Override
    public int modify(BoardDto board) {
        int modify = boardMapper.updateOne(board);
        return modify;
    }

    @Override
    public int delete(int bId) {
        int remove=boardMapper.deleteOne(bId);
        return remove;
    }
}
