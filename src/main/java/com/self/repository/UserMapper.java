package com.self.repository;

import org.apache.ibatis.annotations.Mapper;

import com.self.domain.User;

@Mapper  
public interface UserMapper {  
      
    public User getNameById(int id);  
      
}  
