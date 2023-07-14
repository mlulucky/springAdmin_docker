package com.example.docker_moon.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BoardDto {
    private int b_id;
    private String title;
    private int likes;
    private Date post_time;
    private Date update_time;
}
