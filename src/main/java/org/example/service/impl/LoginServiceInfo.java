package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.LoginInfo;
import org.example.mapper.LoginInfoMapper;
import org.example.service.LoginService;

public class LoginServiceInfo extends ServiceImpl<LoginInfoMapper, LoginInfo> implements LoginService {
    private LoginInfoMapper loginInfoMapper;
}
