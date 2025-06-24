package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.LoginInfo;

@Mapper
public interface LoginInfoMapper extends BaseMapper<LoginInfo> {
}
