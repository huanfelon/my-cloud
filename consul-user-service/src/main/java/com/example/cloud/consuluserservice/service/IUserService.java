package com.example.cloud.consuluserservice.service;

import com.example.cloud.consuluserservice.domain.User;

import java.util.List;

public interface IUserService {
    List<User> getUserList();

    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
