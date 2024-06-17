package com.sparta.newsfeedapp.entity;

import com.sparta.newsfeedapp.dto.comment.CommentCreateRequestDto;
import com.sparta.newsfeedapp.dto.post.PostRequestDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static org.junit.jupiter.api.Assertions.*;

import static com.sparta.newsfeedapp.entity.UserStatusEnum.ACTIVE;

@Component
public class CommentTest {

    private Comment comment;
    private User user;
    private Post post;

    private CommentCreateRequestDto commentCreateRequestDto;
    private PostRequestDto postRequestDto;

    private User setUser() {
        user = new User(
                "1",
                "qwer1234",
                "1@gmaili.com",
                "name1",
                "bio",
                ACTIVE
        );
        return user;
    }
    private Post setPost(){
        this.postRequestDto = new PostRequestDto();
        this.postRequestDto.setContent("test contents.");
        post = new Post(
                postRequestDto,
                setUser()
        );
        return post;
    }

    private Comment setComment(){
        this.commentCreateRequestDto = new CommentCreateRequestDto();
        this.commentCreateRequestDto.setContent("test contents.");
        comment = new Comment(
                this.commentCreateRequestDto,
                setUser(),
                setPost()
        );
        return comment;
    }

    @Test
    @Order(1)
    @DisplayName("comment 생성 성공")
    void test1(){
        setComment();
        assertEquals("test contents.", comment.getContent());
    }


}
