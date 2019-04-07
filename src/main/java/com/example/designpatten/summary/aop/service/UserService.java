package com.example.designpatten.summary.aop.service;

import com.example.designpatten.summary.aop.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public User get(long id){
        logger.info("getUserById method . . .");
        return new User();
    }


    public User get(){
        logger.info("getUser method . . .");
        return new User();
    }

    public void save(User member){
        logger.info("save User method . . .");
    }

    public boolean delete(long id) throws Exception{
        logger.info("delete method . . .");
        throw new Exception("spring aop ThrowAdvice演示");
    }
}
