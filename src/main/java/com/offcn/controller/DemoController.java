package com.offcn.controller;


import com.offcn.domain.User;
import com.offcn.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    public List<User> findAll(){
       return demoService.findAll();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable("id") Integer id){
        return demoService.findOne(id);
    }

    @PostMapping("/")
    public String add(User user){
        try {
            demoService.add(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @PutMapping("/{id}")
    public String update(User user,@PathVariable("id") Integer id){
        try {
            user.setId(id);
            demoService.update(user);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id){
        try {
            demoService.delete(id);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }


    @RequestMapping("get")
    public User getUser(){
        return new User(1,"之后按五级",14,new Date());
    }
}
