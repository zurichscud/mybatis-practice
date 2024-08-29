package org.lai.mybatis.controller;

import org.lai.mybatis.mapper.UserMapper;
import org.lai.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zurichscud
 * @Date: 2024/8/30 上午12:18
 * @Description: TODO
 */
@RestController
public class UserController {
    @Resource
    UserMapper userMapper;

    @GetMapping("/users")
    public String hello(){
        List<User> res = userMapper.query();
        System.out.println(res);
        return "OK";
    }
}
