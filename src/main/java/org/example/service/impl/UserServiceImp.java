package org.example.service.impl;

import org.example.entity.User;
import org.example.mapper.IUserDao;
import org.example.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MF
 * @since 2024-08-14
 */
@Service
public class UserServiceImp extends ServiceImpl<IUserDao, User> implements IUserService {

}
