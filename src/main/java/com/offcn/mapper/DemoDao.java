package com.offcn.mapper;


import com.offcn.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DemoDao {

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id=#{id}")
    User findOne(Integer id);

    @Insert("insert into user(id,name,age) values(#{id},#{name},#{age})")
    void add(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    void update(User user);

    @Delete("delete from user where id=#{id}")
    void delete(Integer id);
}
