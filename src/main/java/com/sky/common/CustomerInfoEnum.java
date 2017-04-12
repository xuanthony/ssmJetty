package com.sky.common;

/**
 * @author xuxinbin
 * @version $$Id: sky-credit, v 0.1 2017/4/12 21:32 xuxinbin Exp $$
 */
public enum  CustomerInfoEnum {

    //客户类别
    CATEGORY_0("CATEGORY", "0", "个人"),
    CATEGORY_1("CATEGORY", "1", "机构"),

    //证件类型
    CERT_TYPE_0("CERTTYPE", "0", "身份证"),
    CERT_TYPE_1("CERTTYPE", "1", "户口簿"),
    CERT_TYPE_2("CERTTYPE", "2", "护照"),
    CERT_TYPE_3("CERTTYPE", "3", "军官证"),
    CERT_TYPE_4("CERTTYPE", "4", "士兵证"),
    CERT_TYPE_5("CERTTYPE", "5", "港澳居民来往内地通行证"),
    CERT_TYPE_6("CERTTYPE", "6", "台湾同胞来往内地通行证"),
    CERT_TYPE_7("CERTTYPE", "7", "临时身份证"),
    CERT_TYPE_8("CERTTYPE", "8", "外国人居留证"),
    CERT_TYPE_9("CERTTYPE", "9", "警官证"),
    CERT_TYPE_A("CERTTYPE", "A", "香港身份证"),
    CERT_TYPE_B("CERTTYPE", "B", "澳门身份证"),
    CERT_TYPE_C("CERTTYPE", "C", "台湾身份证"),
    CERT_TYPE_X("CERTTYPE", "X", "其他证件"),
    CERT_TYPE_D("CERTTYPE", "D", "工商注册号"),
    CERT_TYPE_E("CERTTYPE", "E", "组织机构代码证"),
    CERT_TYPE_F("CERTTYPE", "F", "统一社会信用代码证"),

    //对象明细
    DETAIL_0("DETAIL", "0", "农民"),
    DETAIL_1("DETAIL", "1", "城镇居民"),
    DETAIL_2("DETAIL", "2", "农村个体工商"),
    DETAIL_3("DETAIL", "3", "城镇个体工商"),

    //客户来源
    CUST_SOURCE_0("CUSTSOURCE", "0", "推荐"),
    CUST_SOURCE_1("CUSTSOURCE", "1", "自己上门"),
    CUST_SOURCE_2("CUSTSOURCE", "2", "广告获得"),
    CUST_SOURCE_3("CUSTSOURCE", "3", "其它"),

    //是否授信
    IS_CREDITED_1("ISCREDITED", "1", "是"),
    IS_CREDITED_0("ISCREDITED", "0", "否"),

    //是否删除
    IS_DELETE_1("ISDELETE", "1", "是"),
    IS_DELETE_0("ISDELETE", "0", "否"),

    //信息认证
    CERT_CONFIRM_0("CERTCONFIRM", "0", "等待认证"),
    CERT_CONFIRM_1("CERTCONFIRM", "1", "认证通过"),
    CERT_CONFIRM_2("CERTCONFIRM", "2", "认证不通过"),

    //报名渠道
    REGIST_CHANNEL_0("REGISTCHANNEL", "0", "后台录入"),

    //性别
    GENDER_0("GENDER", "0", "保密"),
    GENDER_1("GENDER", "1", "男性"),
    GENDER_2("GENDER", "2", "女性"),

    //婚烟状况
    MARRIAGE_0("MARRIAGE", "0", "未婚"),
    MARRIAGE_1("MARRIAGE", "1", "已婚"),
    MARRIAGE_2("MARRIAGE", "2", "初婚"),
    MARRIAGE_3("MARRIAGE", "3", "再婚"),
    MARRIAGE_4("MARRIAGE", "4", "复婚"),
    MARRIAGE_5("MARRIAGE", "5", "丧偶"),
    MARRIAGE_6("MARRIAGE", "6", "离婚"),
    MARRIAGE_7("MARRIAGE", "7", "保密"),

    //学历
    EDU_LEVEL_1("EDULEVEL", "1", "研究生及以上"),
    EDU_LEVEL_2("EDULEVEL", "2", "大学本科"),
    EDU_LEVEL_3("EDULEVEL", "3", "专科"),
    EDU_LEVEL_4("EDULEVEL", "4", "中专"),
    EDU_LEVEL_5("EDULEVEL", "5", "技校"),
    EDU_LEVEL_6("EDULEVEL", "6", "高中"),
    EDU_LEVEL_7("EDULEVEL", "7", "初中"),
    EDU_LEVEL_8("EDULEVEL", "8", "小学"),
    EDU_LEVEL_9("EDULEVEL", "9", "文盲或半文盲"),
    EDU_LEVEL_A("EDULEVEL", "A", "未知"),

    //居住状况
    LIVE_CONDITION_0("LIVECONDITION", "0", "自置"),
    LIVE_CONDITION_1("LIVECONDITION", "1", "按揭"),
    LIVE_CONDITION_2("LIVECONDITION", "2", "亲属楼宇"),
    LIVE_CONDITION_3("LIVECONDITION", "3", "集体宿舍"),
    LIVE_CONDITION_4("LIVECONDITION", "4", "租房"),
    LIVE_CONDITION_5("LIVECONDITION", "5", "共有住宅"),
    LIVE_CONDITION_6("LIVECONDITION", "6", "其他"),
    LIVE_CONDITION_7("LIVECONDITION", "7", "未知"),

    //企业规模
    ENTER_SCALE_0("ENTERSCALE", "0", "其他"),
    ENTER_SCALE_1("ENTERSCALE", "1", "大型企业"),
    ENTER_SCALE_2("ENTERSCALE", "2", "中型企业"),
    ENTER_SCALE_3("ENTERSCALE", "3", "小型企业"),
    ENTER_SCALE_4("ENTERSCALE", "4", "微型企业"),

    //企业性质
    ENTER_PROPERTY_0("ENTERPROPERTY", "0", "个体私有"),
    ENTER_PROPERTY_1("ENTERPROPERTY", "1", "国有企业"),
    ENTER_PROPERTY_2("ENTERPROPERTY", "2", "股份公司"),
    ENTER_PROPERTY_3("ENTERPROPERTY", "3", "外商独资"),
    ENTER_PROPERTY_4("ENTERPROPERTY", "4", "合资企业"),
    ENTER_PROPERTY_5("ENTERPROPERTY", "5", "政府性质"),
    ENTER_PROPERTY_6("ENTERPROPERTY", "6", "有限责任公司"),
    ENTER_PROPERTY_7("ENTERPROPERTY", "7", "本集团"),
    ENTER_PROPERTY_8("ENTERPROPERTY", "8", "国有企业"),
    ENTER_PROPERTY_9("ENTERPROPERTY", "9", "集体企业"),
    ENTER_PROPERTY_A("ENTERPROPERTY", "A", "股份合作企业"),
    ENTER_PROPERTY_B("ENTERPROPERTY", "B", "联营企业"),
    ENTER_PROPERTY_C("ENTERPROPERTY", "C", "有限责任公司"),
    ENTER_PROPERTY_D("ENTERPROPERTY", "D", "股份有限公司"),
    ENTER_PROPERTY_E("ENTERPROPERTY", "E", "私营企业"),
    ENTER_PROPERTY_F("ENTERPROPERTY", "F", "三资企业（港、澳、台投资企业）"),
    ENTER_PROPERTY_G("ENTERPROPERTY", "G", "外商投资企业"),
    ENTER_PROPERTY_H("ENTERPROPERTY", "H", "个体经营"),
    ENTER_PROPERTY_Z("ENTERPROPERTY", "Z", "其它"),

    //注册资金币种
    REGIST_CURENCY_0("REGISTCURENCY", "0", "万人民币"),
    REGIST_CURENCY_1("REGISTCURENCY", "1", "万美元"),
    REGIST_CURENCY_2("REGISTCURENCY", "2", "万港币"),

    //单位所属行业
    INDUSTRY_A("INDUSTRY", "A", "农、林、牧、渔业"),
    INDUSTRY_B("INDUSTRY", "B", "采掘业"),
    INDUSTRY_C("INDUSTRY", "C", "制造业"),
    INDUSTRY_D("INDUSTRY", "D", "电力、燃气及水的生产和供应业"),
    INDUSTRY_E("INDUSTRY", "E", "建筑业"),
    INDUSTRY_F("INDUSTRY", "F", "交通运输、仓储和邮政业"),
    INDUSTRY_G("INDUSTRY", "G", "信息传输、计算机服务和软件业"),
    INDUSTRY_H("INDUSTRY", "H", "批发和零售业"),
    INDUSTRY_I("INDUSTRY", "I", "住宿和餐饮业"),
    INDUSTRY_J("INDUSTRY", "J", "金融业"),
    INDUSTRY_K("INDUSTRY", "K", "房地产业"),
    INDUSTRY_L("INDUSTRY", "L", "租赁和商务服务业"),
    INDUSTRY_M("INDUSTRY", "M", "科学研究、技术服务业和地质勘察业"),
    INDUSTRY_N("INDUSTRY", "N", "水利、环境和公共设施管理业"),
    INDUSTRY_O("INDUSTRY", "O", "居民服务和其他服务业"),
    INDUSTRY_P("INDUSTRY", "P", "教育"),
    INDUSTRY_Q("INDUSTRY", "Q", "卫生、社会保障和社会福利业"),
    INDUSTRY_R("INDUSTRY", "R", "文化、体育和娱乐业"),
    INDUSTRY_S("INDUSTRY", "S", "公共管理和社会组织"),
    INDUSTRY_T("INDUSTRY", "T", "国际组织"),
    INDUSTRY_Z("INDUSTRY", "Z", "未知"),

    //职业
    OCCUPATION_0("OCCUPATION", "0", "国家机关、党群组织、企业、事业单位负责人"),
    OCCUPATION_1("OCCUPATION", "1", "专业技术人员"),
    OCCUPATION_2("OCCUPATION", "2", "办事人员和有关人员"),
    OCCUPATION_3("OCCUPATION", "3", "商业、服务业人员"),
    OCCUPATION_4("OCCUPATION", "4", "农、林、牧、渔、水利业生产人员"),
    OCCUPATION_5("OCCUPATION", "5", "生产、运输设备操作人员及有关人员"),
    OCCUPATION_6("OCCUPATION", "6", "军人"),
    OCCUPATION_7("OCCUPATION", "7", "不便分类的其他从业人员"),
    OCCUPATION_Z("OCCUPATION", "Z", "未知"),

    //个人职务
    SELF_DUTY_1("SELFDUTY", "1", "高级领导（行政级别局级及局级以上领导或大公司高级管理人员）"),
    SELF_DUTY_2("SELFDUTY", "2", "中级领导（行政级别局级以下领导或大公司中级管理人员）"),
    SELF_DUTY_3("SELFDUTY", "3", "一般员工"),
    SELF_DUTY_4("SELFDUTY", "4", "其他"),
    SELF_DUTY_Z("SELFDUTY", "Z", "未知"),

    //关系类型
    RELATION_TYPE_1("RELATIONTYPE", "1", "家庭"),
    RELATION_TYPE_2("RELATIONTYPE", "2", "股东"),
    RELATION_TYPE_3("RELATIONTYPE", "3", "高管"),
    RELATION_TYPE_4("RELATIONTYPE", "4", "其它"),

    //控股类型
    HOLD_CATEGORY_0("HOLDCATEGORY", "0", "绝对控股"),
    HOLD_CATEGORY_1("HOLDCATEGORY", "1", "相对控股"),
    HOLD_CATEGORY_2("HOLDCATEGORY", "2", "参股"),
    ;

    String type;
    String no;
    String desc;

    private CustomerInfoEnum(String type, String no, String desc) {
        this.type = type;
        this.no = no;
        this.desc = desc;
    }

    /**
     * Getter method for property type.
     *
     * @return property value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for property type.
     *
     * @param type value to be assigned to property type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for property no.
     *
     * @return property value of no
     */
    public String getNo() {
        return no;
    }

    /**
     * Setter method for property no.
     *
     * @param no value to be assigned to property no
     */
    public void setNo(String no) {
        this.no = no;
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
