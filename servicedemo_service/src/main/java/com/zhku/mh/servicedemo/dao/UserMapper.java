package com.zhku.mh.servicedemo.dao;

import com.zhku.mh.servicedemo.entities.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUser(@Param("id") Integer id);
}
