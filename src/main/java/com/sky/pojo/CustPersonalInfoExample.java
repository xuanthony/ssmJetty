package com.sky.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustPersonalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustPersonalInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNull() {
            addCriterion("cust_no is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(String value) {
            addCriterion("cust_no =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(String value) {
            addCriterion("cust_no <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(String value) {
            addCriterion("cust_no >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_no >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(String value) {
            addCriterion("cust_no <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(String value) {
            addCriterion("cust_no <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLike(String value) {
            addCriterion("cust_no like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotLike(String value) {
            addCriterion("cust_no not like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<String> values) {
            addCriterion("cust_no in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<String> values) {
            addCriterion("cust_no not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(String value1, String value2) {
            addCriterion("cust_no between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(String value1, String value2) {
            addCriterion("cust_no not between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(String value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(String value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(String value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(String value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(String value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLike(String value) {
            addCriterion("marriage like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotLike(String value) {
            addCriterion("marriage not like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<String> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<String> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(String value1, String value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(String value1, String value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andEduLevelIsNull() {
            addCriterion("edu_level is null");
            return (Criteria) this;
        }

        public Criteria andEduLevelIsNotNull() {
            addCriterion("edu_level is not null");
            return (Criteria) this;
        }

        public Criteria andEduLevelEqualTo(String value) {
            addCriterion("edu_level =", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotEqualTo(String value) {
            addCriterion("edu_level <>", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelGreaterThan(String value) {
            addCriterion("edu_level >", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelGreaterThanOrEqualTo(String value) {
            addCriterion("edu_level >=", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLessThan(String value) {
            addCriterion("edu_level <", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLessThanOrEqualTo(String value) {
            addCriterion("edu_level <=", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLike(String value) {
            addCriterion("edu_level like", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotLike(String value) {
            addCriterion("edu_level not like", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelIn(List<String> values) {
            addCriterion("edu_level in", values, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotIn(List<String> values) {
            addCriterion("edu_level not in", values, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelBetween(String value1, String value2) {
            addCriterion("edu_level between", value1, value2, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotBetween(String value1, String value2) {
            addCriterion("edu_level not between", value1, value2, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionIsNull() {
            addCriterion("perm_residence_position is null");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionIsNotNull() {
            addCriterion("perm_residence_position is not null");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionEqualTo(String value) {
            addCriterion("perm_residence_position =", value, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionNotEqualTo(String value) {
            addCriterion("perm_residence_position <>", value, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionGreaterThan(String value) {
            addCriterion("perm_residence_position >", value, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionGreaterThanOrEqualTo(String value) {
            addCriterion("perm_residence_position >=", value, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionLessThan(String value) {
            addCriterion("perm_residence_position <", value, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionLessThanOrEqualTo(String value) {
            addCriterion("perm_residence_position <=", value, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionLike(String value) {
            addCriterion("perm_residence_position like", value, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionNotLike(String value) {
            addCriterion("perm_residence_position not like", value, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionIn(List<String> values) {
            addCriterion("perm_residence_position in", values, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionNotIn(List<String> values) {
            addCriterion("perm_residence_position not in", values, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionBetween(String value1, String value2) {
            addCriterion("perm_residence_position between", value1, value2, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidencePositionNotBetween(String value1, String value2) {
            addCriterion("perm_residence_position not between", value1, value2, "permResidencePosition");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailIsNull() {
            addCriterion("perm_residence_detail is null");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailIsNotNull() {
            addCriterion("perm_residence_detail is not null");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailEqualTo(String value) {
            addCriterion("perm_residence_detail =", value, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailNotEqualTo(String value) {
            addCriterion("perm_residence_detail <>", value, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailGreaterThan(String value) {
            addCriterion("perm_residence_detail >", value, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailGreaterThanOrEqualTo(String value) {
            addCriterion("perm_residence_detail >=", value, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailLessThan(String value) {
            addCriterion("perm_residence_detail <", value, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailLessThanOrEqualTo(String value) {
            addCriterion("perm_residence_detail <=", value, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailLike(String value) {
            addCriterion("perm_residence_detail like", value, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailNotLike(String value) {
            addCriterion("perm_residence_detail not like", value, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailIn(List<String> values) {
            addCriterion("perm_residence_detail in", values, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailNotIn(List<String> values) {
            addCriterion("perm_residence_detail not in", values, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailBetween(String value1, String value2) {
            addCriterion("perm_residence_detail between", value1, value2, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andPermResidenceDetailNotBetween(String value1, String value2) {
            addCriterion("perm_residence_detail not between", value1, value2, "permResidenceDetail");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail >", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThan(String value) {
            addCriterion("address_detail <", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIn(List<String> values) {
            addCriterion("address_detail in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeIsNull() {
            addCriterion("address_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeIsNotNull() {
            addCriterion("address_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeEqualTo(String value) {
            addCriterion("address_zip_code =", value, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeNotEqualTo(String value) {
            addCriterion("address_zip_code <>", value, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeGreaterThan(String value) {
            addCriterion("address_zip_code >", value, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("address_zip_code >=", value, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeLessThan(String value) {
            addCriterion("address_zip_code <", value, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeLessThanOrEqualTo(String value) {
            addCriterion("address_zip_code <=", value, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeLike(String value) {
            addCriterion("address_zip_code like", value, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeNotLike(String value) {
            addCriterion("address_zip_code not like", value, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeIn(List<String> values) {
            addCriterion("address_zip_code in", values, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeNotIn(List<String> values) {
            addCriterion("address_zip_code not in", values, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeBetween(String value1, String value2) {
            addCriterion("address_zip_code between", value1, value2, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andAddressZipCodeNotBetween(String value1, String value2) {
            addCriterion("address_zip_code not between", value1, value2, "addressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionIsNull() {
            addCriterion("home_address_region is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionIsNotNull() {
            addCriterion("home_address_region is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionEqualTo(String value) {
            addCriterion("home_address_region =", value, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionNotEqualTo(String value) {
            addCriterion("home_address_region <>", value, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionGreaterThan(String value) {
            addCriterion("home_address_region >", value, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionGreaterThanOrEqualTo(String value) {
            addCriterion("home_address_region >=", value, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionLessThan(String value) {
            addCriterion("home_address_region <", value, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionLessThanOrEqualTo(String value) {
            addCriterion("home_address_region <=", value, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionLike(String value) {
            addCriterion("home_address_region like", value, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionNotLike(String value) {
            addCriterion("home_address_region not like", value, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionIn(List<String> values) {
            addCriterion("home_address_region in", values, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionNotIn(List<String> values) {
            addCriterion("home_address_region not in", values, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionBetween(String value1, String value2) {
            addCriterion("home_address_region between", value1, value2, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressRegionNotBetween(String value1, String value2) {
            addCriterion("home_address_region not between", value1, value2, "homeAddressRegion");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailIsNull() {
            addCriterion("home_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailIsNotNull() {
            addCriterion("home_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailEqualTo(String value) {
            addCriterion("home_address_detail =", value, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailNotEqualTo(String value) {
            addCriterion("home_address_detail <>", value, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailGreaterThan(String value) {
            addCriterion("home_address_detail >", value, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("home_address_detail >=", value, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailLessThan(String value) {
            addCriterion("home_address_detail <", value, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("home_address_detail <=", value, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailLike(String value) {
            addCriterion("home_address_detail like", value, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailNotLike(String value) {
            addCriterion("home_address_detail not like", value, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailIn(List<String> values) {
            addCriterion("home_address_detail in", values, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailNotIn(List<String> values) {
            addCriterion("home_address_detail not in", values, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailBetween(String value1, String value2) {
            addCriterion("home_address_detail between", value1, value2, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressDetailNotBetween(String value1, String value2) {
            addCriterion("home_address_detail not between", value1, value2, "homeAddressDetail");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeIsNull() {
            addCriterion("home_address_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeIsNotNull() {
            addCriterion("home_address_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeEqualTo(String value) {
            addCriterion("home_address_zip_code =", value, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeNotEqualTo(String value) {
            addCriterion("home_address_zip_code <>", value, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeGreaterThan(String value) {
            addCriterion("home_address_zip_code >", value, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("home_address_zip_code >=", value, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeLessThan(String value) {
            addCriterion("home_address_zip_code <", value, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeLessThanOrEqualTo(String value) {
            addCriterion("home_address_zip_code <=", value, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeLike(String value) {
            addCriterion("home_address_zip_code like", value, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeNotLike(String value) {
            addCriterion("home_address_zip_code not like", value, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeIn(List<String> values) {
            addCriterion("home_address_zip_code in", values, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeNotIn(List<String> values) {
            addCriterion("home_address_zip_code not in", values, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeBetween(String value1, String value2) {
            addCriterion("home_address_zip_code between", value1, value2, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andHomeAddressZipCodeNotBetween(String value1, String value2) {
            addCriterion("home_address_zip_code not between", value1, value2, "homeAddressZipCode");
            return (Criteria) this;
        }

        public Criteria andLiveYearIsNull() {
            addCriterion("live_year is null");
            return (Criteria) this;
        }

        public Criteria andLiveYearIsNotNull() {
            addCriterion("live_year is not null");
            return (Criteria) this;
        }

        public Criteria andLiveYearEqualTo(Integer value) {
            addCriterion("live_year =", value, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearNotEqualTo(Integer value) {
            addCriterion("live_year <>", value, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearGreaterThan(Integer value) {
            addCriterion("live_year >", value, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("live_year >=", value, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearLessThan(Integer value) {
            addCriterion("live_year <", value, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearLessThanOrEqualTo(Integer value) {
            addCriterion("live_year <=", value, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearIn(List<Integer> values) {
            addCriterion("live_year in", values, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearNotIn(List<Integer> values) {
            addCriterion("live_year not in", values, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearBetween(Integer value1, Integer value2) {
            addCriterion("live_year between", value1, value2, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveYearNotBetween(Integer value1, Integer value2) {
            addCriterion("live_year not between", value1, value2, "liveYear");
            return (Criteria) this;
        }

        public Criteria andLiveConditionIsNull() {
            addCriterion("live_condition is null");
            return (Criteria) this;
        }

        public Criteria andLiveConditionIsNotNull() {
            addCriterion("live_condition is not null");
            return (Criteria) this;
        }

        public Criteria andLiveConditionEqualTo(String value) {
            addCriterion("live_condition =", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionNotEqualTo(String value) {
            addCriterion("live_condition <>", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionGreaterThan(String value) {
            addCriterion("live_condition >", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionGreaterThanOrEqualTo(String value) {
            addCriterion("live_condition >=", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionLessThan(String value) {
            addCriterion("live_condition <", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionLessThanOrEqualTo(String value) {
            addCriterion("live_condition <=", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionLike(String value) {
            addCriterion("live_condition like", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionNotLike(String value) {
            addCriterion("live_condition not like", value, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionIn(List<String> values) {
            addCriterion("live_condition in", values, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionNotIn(List<String> values) {
            addCriterion("live_condition not in", values, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionBetween(String value1, String value2) {
            addCriterion("live_condition between", value1, value2, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andLiveConditionNotBetween(String value1, String value2) {
            addCriterion("live_condition not between", value1, value2, "liveCondition");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}