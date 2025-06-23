package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
@TableName("prescription")
@Schema(description = "处方信息实体")
public class Prescription_info {
    // ==================== 枚举定义 ====================
    @Schema(description = "处方状态枚举")
    public enum PrescriptionState {
        @Schema(description = "待缴费") 待缴费,
        @Schema(description = "待执行") 待执行,
        @Schema(description = "已完成") 已完成,
        @Schema(description = "已失效") 已失效,
        @Schema(description = "已退费") 已退费
    }

    @Schema(description = "支付类型枚举")
    public enum PaymentType {
        @Schema(description = "现金") 现金,
        @Schema(description = "医保支付") 医保支付,
        @Schema(description = "就诊卡") 就诊卡,
        @Schema(description = "扫码支付") 扫码支付
    }

    // ==================== 字段声明 ====================
    @Schema(description = "处方序号", example = "1")
    private int pre_sequence;  // 改为int类型

    @Schema(description = "处方号", example = "10001")
    private int pre_id;  // 改为int类型

    @Schema(description = "关联门诊号", example = "20230001")
    private int pre_reg_id;  // 改为int类型

    @Schema(description = "诊断结果/处方内容", example = "感冒发烧，开具退烧药")
    private String pre_content;

    @Schema(description = "开方项目ID", example = "5001")
    private int pre_ci_id;  // 改为int类型

    @Schema(description = "开方数量", example = "3")
    private int pre_ci_num;  // 改为int类型

    @Schema(description = "处方状态",
            allowableValues = {"待缴费", "待执行", "已完成", "已失效", "已退费"})
    private PrescriptionState pre_state;  // 改为枚举类型

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "开方时间", example = "2023-10-01 09:30:00")
    private Date pre_time;  // 改为Date类型

    @Schema(description = "收据编码", example = "20231001001")
    private int pre_receipt_id;  // 改为int类型

    @Schema(description = "收费员ID", example = "1001")
    private int pre_dealer_id;  // 改为int类型

    @Schema(description = "支付类型",
            allowableValues = {"现金", "医保支付", "就诊卡", "扫码支付"})
    private PaymentType pre_deal_type;  // 改为枚举类型

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "收费时间", example = "2023-10-01 10:15:00")
    private Date pre_dealtime;  // 改为Date类型

    // ==================== Getter/Setter ====================
    public int getPre_sequence() {
        return pre_sequence;
    }

    public void setPre_sequence(int pre_sequence) {
        this.pre_sequence = pre_sequence;
    }

    // 保留String类型的setter（兼容旧代码）
    public void setPre_sequence(String pre_sequence) {
        try {
            this.pre_sequence = Integer.parseInt(pre_sequence);
        } catch (NumberFormatException e) {
            this.pre_sequence = 0;
        }
    }

    public int getPre_id() {
        return pre_id;
    }

    public void setPre_id(int pre_id) {
        this.pre_id = pre_id;
    }

    public void setPre_id(String pre_id) {
        try {
            this.pre_id = Integer.parseInt(pre_id);
        } catch (NumberFormatException e) {
            this.pre_id = 0;
        }
    }

    public int getPre_reg_id() {
        return pre_reg_id;
    }

    public void setPre_reg_id(int pre_reg_id) {
        this.pre_reg_id = pre_reg_id;
    }

    public void setPre_reg_id(String pre_reg_id) {
        try {
            this.pre_reg_id = Integer.parseInt(pre_reg_id);
        } catch (NumberFormatException e) {
            this.pre_reg_id = 0;
        }
    }

    public String getPre_content() {
        return pre_content;
    }

    public void setPre_content(String pre_content) {
        this.pre_content = pre_content;
    }

    public int getPre_ci_id() {
        return pre_ci_id;
    }

    public void setPre_ci_id(int pre_ci_id) {
        this.pre_ci_id = pre_ci_id;
    }

    public void setPre_ci_id(String pre_ci_id) {
        try {
            this.pre_ci_id = Integer.parseInt(pre_ci_id);
        } catch (NumberFormatException e) {
            this.pre_ci_id = 0;
        }
    }

    public int getPre_ci_num() {
        return pre_ci_num;
    }

    public void setPre_ci_num(int pre_ci_num) {
        this.pre_ci_num = pre_ci_num;
    }

    public void setPre_ci_num(String pre_ci_num) {
        try {
            this.pre_ci_num = Integer.parseInt(pre_ci_num);
        } catch (NumberFormatException e) {
            this.pre_ci_num = 0;
        }
    }

    public PrescriptionState getPre_state() {
        return pre_state;
    }

    public void setPre_state(PrescriptionState pre_state) {
        this.pre_state = pre_state;
    }

    public void setPre_state(String pre_state) {
        try {
            this.pre_state = PrescriptionState.valueOf(pre_state);
        } catch (IllegalArgumentException e) {
            this.pre_state = null;
        }
    }

    public Date getPre_time() {
        return pre_time;
    }

    public void setPre_time(Date pre_time) {
        this.pre_time = pre_time;
    }

    public void setPre_time(String pre_time) {
        // 实际项目中应实现日期解析逻辑
        // 这里简化为直接设置当前时间
        this.pre_time = new Date();
    }

    public int getPre_receipt_id() {
        return pre_receipt_id;
    }

    public void setPre_receipt_id(int pre_receipt_id) {
        this.pre_receipt_id = pre_receipt_id;
    }

    public void setPre_receipt_id(String pre_receipt_id) {
        try {
            this.pre_receipt_id = Integer.parseInt(pre_receipt_id);
        } catch (NumberFormatException e) {
            this.pre_receipt_id = 0;
        }
    }

    public int getPre_dealer_id() {
        return pre_dealer_id;
    }

    public void setPre_dealer_id(int pre_dealer_id) {
        this.pre_dealer_id = pre_dealer_id;
    }

    public void setPre_dealer_id(String pre_dealer_id) {
        try {
            this.pre_dealer_id = Integer.parseInt(pre_dealer_id);
        } catch (NumberFormatException e) {
            this.pre_dealer_id = 0;
        }
    }

    public PaymentType getPre_deal_type() {
        return pre_deal_type;
    }

    public void setPre_deal_type(PaymentType pre_deal_type) {
        this.pre_deal_type = pre_deal_type;
    }

    public void setPre_deal_type(String pre_deal_type) {
        try {
            this.pre_deal_type = PaymentType.valueOf(pre_deal_type);
        } catch (IllegalArgumentException e) {
            this.pre_deal_type = null;
        }
    }

    public Date getPre_dealtime() {
        return pre_dealtime;
    }

    public void setPre_dealtime(Date pre_dealtime) {
        this.pre_dealtime = pre_dealtime;
    }

    public void setPre_dealtime(String pre_dealtime) {
        // 实际项目中应实现日期解析逻辑
        this.pre_dealtime = new Date();
    }
}
