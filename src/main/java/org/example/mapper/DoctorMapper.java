package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.Doctor_info;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoctorMapper extends BaseMapper<Doctor_info> {
    // 继承BaseMapper已包含基本CRUD操作
    // 如需自定义查询可添加如下方法：
    Doctor_info selectByDocId(Integer docId);
}
