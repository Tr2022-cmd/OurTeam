package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Date;
@TableName("chargeitems")
@Schema(description = "收费项目信息实体")
public class ChargeItemsInfo {
    // ==================== 枚举定义 ====================
    @Schema(description = "收费项目类型枚举")
    public enum ChargeItemType {
        @Schema(description = "检查") 检查,
        @Schema(description = "检验") 检验,
        @Schema(description = "毒性处方") 毒性处方,
        @Schema(description = "I类精神处方") I类精神处方,
        @Schema(description = "II类精神处方") II类精神处方,
        @Schema(description = "麻醉处方") 麻醉处方,
        @Schema(description = "材料费") 材料费,
        @Schema(description = "监护项目") 监护项目,
        @Schema(description = "西药") 西药,
        @Schema(description = "中成药") 中成药,
        @Schema(description = "中药草") 中药草,
        @Schema(description = "治疗") 治疗,
        @Schema(description = "手术") 手术,
        @Schema(description = "放射") 放射
    }

    @Schema(description = "项目状态枚举")
    public enum ItemState {
        @Schema(description = "启用") 启用,
        @Schema(description = "禁用") 禁用
    }

    // ==================== 字段声明 ====================
    @Schema(description = "收费项目ID", example = "1001")
    private int chargeitem_id;  // 改为int类型

    @Schema(description = "收费项目名称", example = "血常规检查")
    private String chargeitem_name;

    @Schema(description = "收费类型",
            allowableValues = {"检查", "检验", "毒性处方", "I类精神处方", "II类精神处方",
                    "麻醉处方", "材料费", "监护项目", "西药", "中成药",
                    "中药草", "治疗", "手术", "放射"})
    private ChargeItemType chargeitem_type;  // 改为枚举类型

    @Schema(description = "项目拼音码", example = "XCGJC")
    private String chargeitem_code;

    @Schema(description = "执行部门ID", example = "201")
    private int chargeitem_ex_dep_id;  // 改为int类型

    @Schema(description = "使用方法", example = "静脉采血")
    private String chargeitem_method;

    @Schema(description = "项目单位", example = "次")
    private String chargeitem_unit;

    @Schema(description = "项目余量", example = "50")
    private int chargeitem_balance;  // 改为int类型

    @Schema(description = "项目价格", example = "25.50")
    private BigDecimal chargeitem_price;  // 改为BigDecimal类型

    @Schema(description = "项目状态", allowableValues = {"启用", "禁用"})
    private ItemState chargeitem_state;  // 改为枚举类型

    @Schema(description = "创建者", example = "admin")
    private String chargeitem_creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "创建时间", example = "2023-10-01 09:30:00")
    private Date chargeitem_time;  // 改为Date类型

    @Schema(description = "最后修改人", example = "admin")
    private String chargeitem_lateest_fixer;

    // ==================== Getter/Setter ====================
    public int getChargeitem_id() {
        return chargeitem_id;
    }

    public void setChargeitem_id(int chargeitem_id) {
        this.chargeitem_id = chargeitem_id;
    }

    public String getChargeitem_name() {
        return chargeitem_name;
    }

    public void setChargeitem_name(String chargeitem_name) {
        this.chargeitem_name = chargeitem_name;
    }

    public ChargeItemType getChargeitem_type() {
        return chargeitem_type;
    }

    public void setChargeitem_type(ChargeItemType chargeitem_type) {
        this.chargeitem_type = chargeitem_type;
    }

    // 支持String类型输入的setter
    public void setChargeitem_type(String chargeitem_type) {
        try {
            this.chargeitem_type = ChargeItemType.valueOf(chargeitem_type);
        } catch (IllegalArgumentException e) {
            this.chargeitem_type = null;
        }
    }

    public String getChargeitem_code() {
        return chargeitem_code;
    }

    public void setChargeitem_code(String chargeitem_code) {
        this.chargeitem_code = chargeitem_code;
    }

    public int getChargeitem_ex_dep_id() {
        return chargeitem_ex_dep_id;
    }

    public void setChargeitem_ex_dep_id(int chargeitem_ex_dep_id) {
        this.chargeitem_ex_dep_id = chargeitem_ex_dep_id;
    }

    public String getChargeitem_method() {
        return chargeitem_method;
    }

    public void setChargeitem_method(String chargeitem_method) {
        this.chargeitem_method = chargeitem_method;
    }

    public String getChargeitem_unit() {
        return chargeitem_unit;
    }

    public void setChargeitem_unit(String chargeitem_unit) {
        this.chargeitem_unit = chargeitem_unit;
    }

    public int getChargeitem_balance() {
        return chargeitem_balance;
    }

    public void setChargeitem_balance(int chargeitem_balance) {
        this.chargeitem_balance = chargeitem_balance;
    }

    public BigDecimal getChargeitem_price() {
        return chargeitem_price;
    }

    public void setChargeitem_price(BigDecimal chargeitem_price) {
        this.chargeitem_price = chargeitem_price;
    }

    // 支持String类型输入的setter
    public void setChargeitem_price(String chargeitem_price) {
        try {
            this.chargeitem_price = new BigDecimal(chargeitem_price);
        } catch (NumberFormatException e) {
            this.chargeitem_price = null;
        }
    }

    public ItemState getChargeitem_state() {
        return chargeitem_state;
    }

    public void setChargeitem_state(ItemState chargeitem_state) {
        this.chargeitem_state = chargeitem_state;
    }

    // 支持String类型输入的setter
    public void setChargeitem_state(String chargeitem_state) {
        try {
            this.chargeitem_state = ItemState.valueOf(chargeitem_state);
        } catch (IllegalArgumentException e) {
            this.chargeitem_state = null;
        }
    }

    public String getChargeitem_creator() {
        return chargeitem_creator;
    }

    public void setChargeitem_creator(String chargeitem_creator) {
        this.chargeitem_creator = chargeitem_creator;
    }

    public Date getChargeitem_time() {
        return chargeitem_time;
    }

    public void setChargeitem_time(Date chargeitem_time) {
        this.chargeitem_time = chargeitem_time;
    }

    public String getChargeitem_lateest_fixer() {
        return chargeitem_lateest_fixer;
    }

    public void setChargeitem_lateest_fixer(String chargeitem_lateest_fixer) {
        this.chargeitem_lateest_fixer = chargeitem_lateest_fixer;
    }
}
