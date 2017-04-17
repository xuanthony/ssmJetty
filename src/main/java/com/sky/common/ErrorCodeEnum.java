package com.sky.common;

/**
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/17 21:24 xuxinbin Exp $$
 */
public enum ErrorCodeEnum {


    ;

    ErrorCodeEnum(String errorCode, String desc) {
        this.errorCode = errorCode;
        this.desc = desc;
    }

    private String errorCode;
    private String desc;

    /**
     * Getter method for property errorCode.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property errorCode.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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
