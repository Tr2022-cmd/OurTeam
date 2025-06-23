package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author MF
 * @since 2024-08-14
 */
@Mapper
public interface IUserDao extends BaseMapper<User> {
   // void save(User user);
   @Select("select * from login_info")
    public List<User> findalluser();
}
