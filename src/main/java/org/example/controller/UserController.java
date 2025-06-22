package org.example.controller;

import org.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MF
 * @since 2024-08-14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService us;
    @RequestMapping("/hello")
    public String method1(){
        return "hello world";
    }
    @RequestMapping("/hello2")
    public String method2(){
        return "hello world222";
    }
}
