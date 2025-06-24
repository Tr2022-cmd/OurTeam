package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.example.entity.Login_info;

@Mapper
public interface LoginInfoMapper extends BaseMapper<Login_info> {

    // 登录验证
    @Select("SELECT * FROM login_info WHERE id = #{id} AND password = #{password} LIMIT 1")
    Login_info checkLogin(@Param("id") int id, @Param("password") String password);

    // 修改密码
    @Update("UPDATE login_info SET password = #{newPassword} WHERE id = #{id} AND password = #{oldPassword}")
    int updatePassword(@Param("id") int id,
                       @Param("oldPassword") String oldPassword,
                       @Param("newPassword") String newPassword);
}
