package com.example.docker_moon.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BoardDto {
    private int bId;
    private String title;
    private int likes;
    private Date postTime;
    private Date updateTime;
}
