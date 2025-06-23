package org.example.controller;

import org.example.entity.User;
import org.example.mapper.IUserDao;
import org.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MF
 * @since 2024-08-14
 */
@RestController
public class UserController {

    //@Autowired
    //private IUserService us;
    @Autowired
    private IUserDao ud;
    @PostMapping("/user/save")
    public void save(User user){
        int i=ud.insert(user);
        System.out.println(user);
        System.out.println("已插入"+i+"条数据");
    }
    @GetMapping("/user/findall")
    public List<User> findAll(){
        List<User>list=ud.findalluser();
        System.out.println(list);
        return list;
    }

}
