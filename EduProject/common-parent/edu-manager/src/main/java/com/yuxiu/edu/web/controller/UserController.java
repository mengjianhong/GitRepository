package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("login")
    public String login() {
        return "Default";
    }
    @RequestMapping("find")
    public String find(Integer id){
        User user=userService.findByID(id);
        System.out.println(user);
        return null;
    }
    @RequestMapping("manage")
    public String manage(Integer id){
      return "User/Manage";
    }
    @RequestMapping("info")
    public String info(Integer id){
        return "User/Info";
    }

    @RequestMapping("about")
    public String about(Integer id){
        return "User/About";
    }


    @RequestMapping("edit")
    public String edit(Integer id){
        return "User/Edit";
    }

    @RequestMapping("update")
    public String update(Integer id){
        return "User/Update";
    }

}
