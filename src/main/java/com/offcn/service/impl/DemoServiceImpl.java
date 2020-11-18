package com.offcn.service.impl;

import com.offcn.mapper.DemoDao;
import com.offcn.domain.User;
import com.offcn.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;
    @Override
    public List<User> findAll() {
        return demoDao.findAll();
    }

    @Override
    public User findOne(Integer id) {
        return demoDao.findOne(id);
    }

    @Override
    public void add(User user) {
        demoDao.add(user);
    }

    @Override
    public void update(User user) {
        demoDao.update(user);
    }

    @Override
    public void delete(Integer id) {
        demoDao.delete(id);
    }
}
