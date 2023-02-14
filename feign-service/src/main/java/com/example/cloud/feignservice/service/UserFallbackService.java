package com.example.cloud.feignservice.service;

import com.example.cloud.feignservice.domain.CommonResult;
import com.example.cloud.feignservice.domain.User;
import org.springframework.stereotype.Component;

/**
*  服务降级实现类UserFallbackService
* 实现了UserService接口，并且对接口中的每个实现方法进行了服务降级逻辑的实现。
* @Author: hfl
* @Date: 2023/2/14
*/
@Component
public class UserFallbackService implements UserService {
    @Override
    public CommonResult create(User user) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getUser(Long id) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult<User> getByUsername(String username) {
        User defaultUser = new User(-1L, "defaultUser", "123456");
        return new CommonResult<>(defaultUser);
    }

    @Override
    public CommonResult update(User user) {
        return new CommonResult("调用失败，服务被降级",500);
    }

    @Override
    public CommonResult delete(Long id) {
        return new CommonResult("调用失败，服务被降级",500);
    }
}
