package org.lai.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lai.mybatis.model.User;

import java.util.List;

/**
 * @Author: zurichscud
 * @Date: 2024/8/30 上午12:04
 * @Description: TODO
 */
@Mapper
public interface UserMapper {

    List<User> query();
}
