package com.sky.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一的响应格式
 *
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/17 14:42 xuxinbin Exp $$
 */
public class ResponseResult {

    /**
     * 返回数据
     */
    private Map<String, Object> data;

    /**
     *
     */
    private ReqInfo reqInfo;

    private class ReqInfo {

        /**
         * 结果信息
         */
        private String resultMsg;
        /**
         * 唯一的ID 用于追踪错误信息（待定）
         */
        private String traceId;
        /**
         * 结果码（待定）
         */
        private String resultCode;
        /**
         * 展示类型（待定）
         */
        private String showType;
        /**
         * 成功（true）、失败（false）
         */
        private String success = CommonCodeEnum.TRUE.getCode();

        /**
         * Getter method for property resultMsg.
         *
         * @return property value of resultMsg
         */
        public String getResultMsg() {
            return resultMsg;
        }

        /**
         * Setter method for property resultMsg.
         *
         * @param resultMsg value to be assigned to property resultMsg
         */
        public void setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
        }

        /**
         * Getter method for property traceId.
         *
         * @return property value of traceId
         */
        public String getTraceId() {
            return traceId;
        }

        /**
         * Setter method for property traceId.
         *
         * @param traceId value to be assigned to property traceId
         */
        public void setTraceId(String traceId) {
            this.traceId = traceId;
        }

        /**
         * Getter method for property resultCode.
         *
         * @return property value of resultCode
         */
        public String getResultCode() {
            return resultCode;
        }

        /**
         * Setter method for property resultCode.
         *
         * @param resultCode value to be assigned to property resultCode
         */
        public void setResultCode(String resultCode) {
            this.resultCode = resultCode;
        }

        /**
         * Getter method for property showType.
         *
         * @return property value of showType
         */
        public String getShowType() {
            return showType;
        }

        /**
         * Setter method for property showType.
         *
         * @param showType value to be assigned to property showType
         */
        public void setShowType(String showType) {
            this.showType = showType;
        }

        /**
         * Getter method for property success.
         *
         * @return property value of success
         */
        public String getSuccess() {
            return success;
        }

        /**
         * Setter method for property success.
         *
         * @param success value to be assigned to property success
         */
        public void setSuccess(String success) {
            this.success = success;
        }
    }

    /**
     * Getter method for property data.
     *
     * @return property value of data
     */
    public Map<String, Object> getData() {
        return data;
    }

    /**
     * Setter method for property data.
     *
     * @param data value to be assigned to property data
     */
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    /**
     * Getter method for property reqInfo.
     *
     * @return property value of reqInfo
     */
    public ReqInfo getReqInfo() {
        return reqInfo;
    }

    /**
     * Setter method for property reqInfo.
     *
     * @param reqInfo value to be assigned to property reqInfo
     */
    public void setReqInfo(ReqInfo reqInfo) {
        this.reqInfo = reqInfo;
    }

    public void putData(String key, Object data) {
        if (this.getData() == null) {
            this.data = new HashMap<String, Object>();
        }
        this.getData().put(key, data);
    }
}
