package com.offcn.service;

import com.offcn.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DemoService {

    List<User> findAll();

    User findOne(Integer id);

    void add(User user);

    void update(User user);

    void delete(Integer id);
}
