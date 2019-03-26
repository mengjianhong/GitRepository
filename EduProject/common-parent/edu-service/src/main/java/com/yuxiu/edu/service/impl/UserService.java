package com.yuxiu.edu.service.impl;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import com.yuxiu.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User findByUUID(String id) {
        return null;
    }

    @Override
    public void Login(String userName, String userPassword) {

    }

    @Override
    public User findByID(Integer id)
    {
        User user=userMapper.findByID(id);
        return user;
    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public void deleteByUUID(String id) {

    }

    @Override
    public Integer update(User user) {
        return null;
    }

    @Override
    public Integer insert(User user) {
        return null;
    }
}
