package com.sparta.newsfeedapp.aop;

import com.sparta.newsfeedapp.repository.CommentRepository;
import com.sparta.newsfeedapp.repository.PostRepository;
import com.sparta.newsfeedapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Slf4j(topic = "AopTest")
@Aspect
@Component
@RequiredArgsConstructor
public class AopTest {


    private final CommentRepository commentRepository;

    private final PostRepository postRepository;

    private final UserRepository userRepository;

    @Pointcut("execution(* com.sparta.newsfeedapp.controller.AuthController.*(..))")
    private void auth() {};
    @Pointcut("execution(* com.sparta.newsfeedapp.controller.CommentController.*(..))")
    private void comment() {};
    @Pointcut("execution(* com.sparta.newsfeedapp.controller.MailController.*(..))")
    private void mail() {};
    @Pointcut("execution(* com.sparta.newsfeedapp.controller.PostController.*(..))")
    private void post() {};
    @Pointcut("execution(* com.sparta.newsfeedapp.controller.UserController.*(..))")
    private void user() {};


    public void excuteAuth() {

    }


}
