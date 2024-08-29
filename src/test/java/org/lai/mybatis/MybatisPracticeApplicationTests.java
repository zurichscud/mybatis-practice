package org.lai.mybatis;

import org.junit.jupiter.api.Test;
import org.lai.mybatis.mapper.UserMapper;
import org.lai.mybatis.model.User;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisPracticeApplicationTests {
    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> res = userMapper.query();
        System.out.println(res);
    }

}
