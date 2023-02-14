package com.example.cloud.feignservice.controller;

import com.example.cloud.feignservice.domain.CommonResult;
import com.example.cloud.feignservice.domain.User;
import com.example.cloud.feignservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*  UserFeignController调用UserService实现服务调用
* @Author: hfl
* @Date: 2023/2/14
*/
@RestController
@RequestMapping("/user")
public class UserFeignController {
    @Autowired
    UserService userService;

    /**
    *  use-service在eureka中注册多个服务后，
    *  feign-service调用eureka中的use-service方法会在多个服务中交替执行
    * @Author: hfl
    * @Date: 2023/2/14
    */
    @GetMapping("/{id}")
    public CommonResult getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/getByUsername")
    public CommonResult getByUsername(@RequestParam String username) {
        return userService.getByUsername(username);
    }

    @PostMapping("/create")
    public CommonResult create(@RequestBody User user) {
        return userService.create(user);
    }

    @PostMapping("/update")
    public CommonResult update(@RequestBody User user) {
        return userService.update(user);
    }

    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        return userService.delete(id);
    }
}
