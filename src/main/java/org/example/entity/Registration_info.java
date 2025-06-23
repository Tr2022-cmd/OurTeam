package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
@TableName("registration_info")
@Schema(description = "挂号信息实体")
public class Registration_info {
    // ==================== 枚举定义 ====================
    @Schema(description = "挂号状态枚举")
    public enum RegistrationState {
        @Schema(description = "待就诊") 待就诊,
        @Schema(description = "已就诊") 已就诊,
        @Schema(description = "已退号") 已退号,
        @Schema(description = "已失效") 已失效,
        @Schema(description = "待缴费") 待缴费
    }

    @Schema(description = "挂号类型枚举")
    public enum RegistrationType {
        @Schema(description = "普通门诊") 普通门诊,
        @Schema(description = "急诊") 急诊,
        @Schema(description = "慢病门诊") 慢病门诊,
        @Schema(description = "儿童门诊") 儿童门诊,
        @Schema(description = "简易门诊") 简易门诊,
        @Schema(description = "特病门诊") 特病门诊
    }

    @Schema(description = "收费类型枚举")
    public enum FeeType {
        @Schema(description = "自费") 自费,
        @Schema(description = "职工医保") 职工医保,
        @Schema(description = "居民医保") 居民医保,
        @Schema(description = "金保") 金保,
        @Schema(description = "一卡通") 一卡通,
        @Schema(description = "其他") 其他
    }

    @Schema(description = "就诊类型枚举")
    public enum ConsultationType {
        @Schema(description = "初诊") 初诊,
        @Schema(description = "复诊") 复诊
    }

    @Schema(description = "支付方式枚举")
    public enum PaymentType {
        @Schema(description = "现金") 现金,
        @Schema(description = "扫码支付") 扫码支付,
        @Schema(description = "就诊卡") 就诊卡,
        @Schema(description = "医保支付") 医保支付
    }

    // ==================== 字段声明 ====================
    @Schema(description = "门诊号", example = "20230001")
    private int reg_id;  // 改为int类型

    @Schema(description = "就诊卡号", example = "10001")
    private int reg_hcard_id;  // 改为int类型

    @Schema(description = "部门ID", example = "101")
    private String reg_dep_id;

    @Schema(description = "医生ID", example = "5001")
    private int reg_doc_id;  // 改为int类型

    @Schema(description = "挂号状态",
            allowableValues = {"待就诊", "已就诊", "已退号", "已失效", "待缴费"})
    private RegistrationState reg_state;  // 改为枚举类型

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "挂号时间", example = "2023-10-01 08:30:00")
    private Date reg_time;  // 改为Date类型

    @Schema(description = "挂号类型",
            allowableValues = {"普通门诊", "急诊", "慢病门诊", "儿童门诊", "简易门诊", "特病门诊"})
    private RegistrationType reg_type;  // 改为枚举类型

    @Schema(description = "收费类型",
            allowableValues = {"自费", "职工医保", "居民医保", "金保", "一卡通", "其他"})
    private FeeType reg_fee_type;  // 改为枚举类型

    @Schema(description = "就诊类型", allowableValues = {"初诊", "复诊"})
    private ConsultationType reg_consultation_type;  // 改为枚举类型

    @Schema(description = "排班号", example = "3001")
    private int reg_arrange_id;  // 改为int类型

    @Schema(description = "收费员ID", example = "1001")
    private int reg_dealer_id;  // 改为int类型

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "收费时间", example = "2023-10-01 08:35:00")
    private Date reg_deal_time;  // 改为Date类型

    @Schema(description = "支付方式",
            allowableValues = {"现金", "扫码支付", "就诊卡", "医保支付"})
    private PaymentType reg_deal_type;  // 改为枚举类型

    // ==================== Getter/Setter ====================
    // reg_id
    public int getReg_id() {
        return reg_id;
    }
    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
    }
    public void setReg_id(String reg_id) {
        try {
            this.reg_id = Integer.parseInt(reg_id);
        } catch (NumberFormatException e) {
            this.reg_id = 0;
        }
    }

    // reg_hcard_id
    public int getReg_hcard_id() {
        return reg_hcard_id;
    }
    public void setReg_hcard_id(int reg_hcard_id) {
        this.reg_hcard_id = reg_hcard_id;
    }
    public void setReg_hcard_id(String reg_hcard_id) {
        try {
            this.reg_hcard_id = Integer.parseInt(reg_hcard_id);
        } catch (NumberFormatException e) {
            this.reg_hcard_id = 0;
        }
    }

    // reg_dep_id (保持不变)
    public String getReg_dep_id() {
        return reg_dep_id;
    }
    public void setReg_dep_id(String reg_dep_id) {
        this.reg_dep_id = reg_dep_id;
    }

    // reg_doc_id
    public int getReg_doc_id() {
        return reg_doc_id;
    }
    public void setReg_doc_id(int reg_doc_id) {
        this.reg_doc_id = reg_doc_id;
    }
    public void setReg_doc_id(String reg_doc_id) {
        try {
            this.reg_doc_id = Integer.parseInt(reg_doc_id);
        } catch (NumberFormatException e) {
            this.reg_doc_id = 0;
        }
    }

    // reg_state
    public RegistrationState getReg_state() {
        return reg_state;
    }
    public void setReg_state(RegistrationState reg_state) {
        this.reg_state = reg_state;
    }
    public void setReg_state(String reg_state) {
        try {
            this.reg_state = RegistrationState.valueOf(reg_state);
        } catch (IllegalArgumentException e) {
            this.reg_state = null;
        }
    }

    // reg_time
    public Date getReg_time() {
        return reg_time;
    }
    public void setReg_time(Date reg_time) {
        this.reg_time = reg_time;
    }
    public void setReg_time(String reg_time) {
        // 实际项目中应实现日期解析
        this.reg_time = new Date();
    }

    // reg_type
    public RegistrationType getReg_type() {
        return reg_type;
    }
    public void setReg_type(RegistrationType reg_type) {
        this.reg_type = reg_type;
    }
    public void setReg_type(String reg_type) {
        try {
            this.reg_type = RegistrationType.valueOf(reg_type);
        } catch (IllegalArgumentException e) {
            this.reg_type = null;
        }
    }

    // reg_fee_type
    public FeeType getReg_fee_type() {
        return reg_fee_type;
    }
    public void setReg_fee_type(FeeType reg_fee_type) {
        this.reg_fee_type = reg_fee_type;
    }
    public void setReg_fee_type(String reg_fee_type) {
        try {
            this.reg_fee_type = FeeType.valueOf(reg_fee_type);
        } catch (IllegalArgumentException e) {
            this.reg_fee_type = null;
        }
    }

    // reg_consultation_type
    public ConsultationType getReg_consultation_type() {
        return reg_consultation_type;
    }
    public void setReg_consultation_type(ConsultationType reg_consultation_type) {
        this.reg_consultation_type = reg_consultation_type;
    }
    public void setReg_consultation_type(String reg_consultation_type) {
        try {
            this.reg_consultation_type = ConsultationType.valueOf(reg_consultation_type);
        } catch (IllegalArgumentException e) {
            this.reg_consultation_type = null;
        }
    }

    // reg_arrange_id
    public int getReg_arrange_id() {
        return reg_arrange_id;
    }
    public void setReg_arrange_id(int reg_arrange_id) {
        this.reg_arrange_id = reg_arrange_id;
    }
    public void setReg_arrange_id(String reg_arrange_id) {
        try {
            this.reg_arrange_id = Integer.parseInt(reg_arrange_id);
        } catch (NumberFormatException e) {
            this.reg_arrange_id = 0;
        }
    }

    // reg_dealer_id
    public int getReg_dealer_id() {
        return reg_dealer_id;
    }
    public void setReg_dealer_id(int reg_dealer_id) {
        this.reg_dealer_id = reg_dealer_id;
    }
    public void setReg_dealer_id(String reg_dealer_id) {
        try {
            this.reg_dealer_id = Integer.parseInt(reg_dealer_id);
        } catch (NumberFormatException e) {
            this.reg_dealer_id = 0;
        }
    }

    // reg_deal_time
    public Date getReg_deal_time() {
        return reg_deal_time;
    }
    public void setReg_deal_time(Date reg_deal_time) {
        this.reg_deal_time = reg_deal_time;
    }
    public void setReg_deal_time(String reg_deal_time) {
        // 实际项目中应实现日期解析
        this.reg_deal_time = new Date();
    }

    // reg_deal_type
    public PaymentType getReg_deal_type() {
        return reg_deal_type;
    }
    public void setReg_deal_type(PaymentType reg_deal_type) {
        this.reg_deal_type = reg_deal_type;
    }
    public void setReg_deal_type(String reg_deal_type) {
        try {
            this.reg_deal_type = PaymentType.valueOf(reg_deal_type);
        } catch (IllegalArgumentException e) {
            this.reg_deal_type = null;
        }
    }
}
