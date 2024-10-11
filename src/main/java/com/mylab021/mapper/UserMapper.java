package com.mylab021.mapper;

import com.mylab021.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectAll();

    public User selectById(Integer id);

    public List<User> selectByIds(List<Integer> list);

    public void insert(User user);
}
