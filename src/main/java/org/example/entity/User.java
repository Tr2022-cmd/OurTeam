package org.example.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author MF
 * @since 2024-08-14
 */
@Data   //这个注解会为类中的字段，自动生成get/set、tostring方法
@TableName("login_info")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private Rank rank;

    public enum Rank{

        administrator("A","administrator"),
        operator("O","operator"),
        UNKNOWN("NULL","无");

        private String code;
        @EnumValue
        private String desc;
        Rank(String code, String desc){
            this.code = code;
            this.desc = desc;
        }
        public String getDesc(){
            return desc;
        }
    }

    private String password;
    @Override
    public String toString(){
        return "id:"+id+",rank:"+rank+",password:"+password;
    }
}
