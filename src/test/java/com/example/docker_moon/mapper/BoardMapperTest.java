package com.example.docker_moon.mapper;
import com.example.docker_moon.dto.BoardDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BoardMapperTest {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    void findAll(){
        List<BoardDto> boards = boardMapper.findAll();
        System.out.println("boards = " + boards);
    }

    @Test
    void insertOne(){
        BoardDto board = new BoardDto();
        board.setTitle("테스트 제목");
        int insert=boardMapper.insertOne(board);
        System.out.println("insert = " + insert);
    }

}
