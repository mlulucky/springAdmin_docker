USE mydb;

CREATE TABLE board (
    b_id    INT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT '게시글 아이디',
    title VARCHAR(255) COMMENT '제목',
    likes INT DEFAULT 0 COMMENT '좋아요수',
    post_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '작성시간',
    update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정시간'
)