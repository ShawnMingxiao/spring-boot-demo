package com.self.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.domain.User;
import com.self.repository.UserMapper;
import com.self.service.UserService;

@Service  
public class UserServiceImpl implements UserService{  
      
    @Autowired  
    private UserMapper userDao;  
  
    @Override  
    public User getNameById(int id) {  
        return userDao.getNameById(id);  
    }  
      
      
  
}  
