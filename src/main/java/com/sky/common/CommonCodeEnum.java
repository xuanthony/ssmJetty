package com.sky.common;

/**
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/17 16:26 xuxinbin Exp $$
 */
public enum CommonCodeEnum {
    TRUE("true", "操作成功"),

    FALSE("false", "操作失败"),

    ;

    CommonCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private String code;
    private String desc;

    /**
     * Getter method for property code.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property code.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property desc.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property desc.
     *
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
