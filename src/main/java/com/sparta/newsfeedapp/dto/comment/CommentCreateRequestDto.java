package com.sparta.newsfeedapp.dto.comment;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CommentCreateRequestDto {
    private String content;
}
