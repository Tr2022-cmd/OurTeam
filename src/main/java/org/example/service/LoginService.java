package org.example.service;

import org.example.entity.Login_info;

public interface LoginService {
    // 登录验证
    Login_info login(int id, String password);

    // 修改密码
    boolean changePassword(int id, String oldPassword, String newPassword);
}
