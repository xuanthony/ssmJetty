package com.sky.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustRelationshipInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustRelationshipInfoExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("relation_type is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("relation_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(String value) {
            addCriterion("relation_type =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(String value) {
            addCriterion("relation_type <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(String value) {
            addCriterion("relation_type >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("relation_type >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(String value) {
            addCriterion("relation_type <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(String value) {
            addCriterion("relation_type <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLike(String value) {
            addCriterion("relation_type like", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotLike(String value) {
            addCriterion("relation_type not like", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<String> values) {
            addCriterion("relation_type in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<String> values) {
            addCriterion("relation_type not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(String value1, String value2) {
            addCriterion("relation_type between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(String value1, String value2) {
            addCriterion("relation_type not between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationDetailIsNull() {
            addCriterion("relation_detail is null");
            return (Criteria) this;
        }

        public Criteria andRelationDetailIsNotNull() {
            addCriterion("relation_detail is not null");
            return (Criteria) this;
        }

        public Criteria andRelationDetailEqualTo(String value) {
            addCriterion("relation_detail =", value, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailNotEqualTo(String value) {
            addCriterion("relation_detail <>", value, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailGreaterThan(String value) {
            addCriterion("relation_detail >", value, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailGreaterThanOrEqualTo(String value) {
            addCriterion("relation_detail >=", value, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailLessThan(String value) {
            addCriterion("relation_detail <", value, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailLessThanOrEqualTo(String value) {
            addCriterion("relation_detail <=", value, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailLike(String value) {
            addCriterion("relation_detail like", value, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailNotLike(String value) {
            addCriterion("relation_detail not like", value, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailIn(List<String> values) {
            addCriterion("relation_detail in", values, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailNotIn(List<String> values) {
            addCriterion("relation_detail not in", values, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailBetween(String value1, String value2) {
            addCriterion("relation_detail between", value1, value2, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationDetailNotBetween(String value1, String value2) {
            addCriterion("relation_detail not between", value1, value2, "relationDetail");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdIsNull() {
            addCriterion("relation_biz_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdIsNotNull() {
            addCriterion("relation_biz_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdEqualTo(Long value) {
            addCriterion("relation_biz_id =", value, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdNotEqualTo(Long value) {
            addCriterion("relation_biz_id <>", value, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdGreaterThan(Long value) {
            addCriterion("relation_biz_id >", value, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdGreaterThanOrEqualTo(Long value) {
            addCriterion("relation_biz_id >=", value, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdLessThan(Long value) {
            addCriterion("relation_biz_id <", value, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdLessThanOrEqualTo(Long value) {
            addCriterion("relation_biz_id <=", value, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdIn(List<Long> values) {
            addCriterion("relation_biz_id in", values, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdNotIn(List<Long> values) {
            addCriterion("relation_biz_id not in", values, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdBetween(Long value1, Long value2) {
            addCriterion("relation_biz_id between", value1, value2, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelationBizIdNotBetween(Long value1, Long value2) {
            addCriterion("relation_biz_id not between", value1, value2, "relationBizId");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameIsNull() {
            addCriterion("related_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameIsNotNull() {
            addCriterion("related_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameEqualTo(String value) {
            addCriterion("related_cust_name =", value, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameNotEqualTo(String value) {
            addCriterion("related_cust_name <>", value, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameGreaterThan(String value) {
            addCriterion("related_cust_name >", value, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("related_cust_name >=", value, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameLessThan(String value) {
            addCriterion("related_cust_name <", value, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameLessThanOrEqualTo(String value) {
            addCriterion("related_cust_name <=", value, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameLike(String value) {
            addCriterion("related_cust_name like", value, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameNotLike(String value) {
            addCriterion("related_cust_name not like", value, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameIn(List<String> values) {
            addCriterion("related_cust_name in", values, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameNotIn(List<String> values) {
            addCriterion("related_cust_name not in", values, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameBetween(String value1, String value2) {
            addCriterion("related_cust_name between", value1, value2, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCustNameNotBetween(String value1, String value2) {
            addCriterion("related_cust_name not between", value1, value2, "relatedCustName");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeIsNull() {
            addCriterion("related_cert_type is null");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeIsNotNull() {
            addCriterion("related_cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeEqualTo(String value) {
            addCriterion("related_cert_type =", value, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeNotEqualTo(String value) {
            addCriterion("related_cert_type <>", value, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeGreaterThan(String value) {
            addCriterion("related_cert_type >", value, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("related_cert_type >=", value, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeLessThan(String value) {
            addCriterion("related_cert_type <", value, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeLessThanOrEqualTo(String value) {
            addCriterion("related_cert_type <=", value, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeLike(String value) {
            addCriterion("related_cert_type like", value, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeNotLike(String value) {
            addCriterion("related_cert_type not like", value, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeIn(List<String> values) {
            addCriterion("related_cert_type in", values, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeNotIn(List<String> values) {
            addCriterion("related_cert_type not in", values, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeBetween(String value1, String value2) {
            addCriterion("related_cert_type between", value1, value2, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertTypeNotBetween(String value1, String value2) {
            addCriterion("related_cert_type not between", value1, value2, "relatedCertType");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoIsNull() {
            addCriterion("related_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoIsNotNull() {
            addCriterion("related_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoEqualTo(String value) {
            addCriterion("related_cert_no =", value, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoNotEqualTo(String value) {
            addCriterion("related_cert_no <>", value, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoGreaterThan(String value) {
            addCriterion("related_cert_no >", value, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("related_cert_no >=", value, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoLessThan(String value) {
            addCriterion("related_cert_no <", value, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoLessThanOrEqualTo(String value) {
            addCriterion("related_cert_no <=", value, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoLike(String value) {
            addCriterion("related_cert_no like", value, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoNotLike(String value) {
            addCriterion("related_cert_no not like", value, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoIn(List<String> values) {
            addCriterion("related_cert_no in", values, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoNotIn(List<String> values) {
            addCriterion("related_cert_no not in", values, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoBetween(String value1, String value2) {
            addCriterion("related_cert_no between", value1, value2, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedCertNoNotBetween(String value1, String value2) {
            addCriterion("related_cert_no not between", value1, value2, "relatedCertNo");
            return (Criteria) this;
        }

        public Criteria andRelatedTelIsNull() {
            addCriterion("related_tel is null");
            return (Criteria) this;
        }

        public Criteria andRelatedTelIsNotNull() {
            addCriterion("related_tel is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedTelEqualTo(String value) {
            addCriterion("related_tel =", value, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelNotEqualTo(String value) {
            addCriterion("related_tel <>", value, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelGreaterThan(String value) {
            addCriterion("related_tel >", value, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelGreaterThanOrEqualTo(String value) {
            addCriterion("related_tel >=", value, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelLessThan(String value) {
            addCriterion("related_tel <", value, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelLessThanOrEqualTo(String value) {
            addCriterion("related_tel <=", value, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelLike(String value) {
            addCriterion("related_tel like", value, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelNotLike(String value) {
            addCriterion("related_tel not like", value, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelIn(List<String> values) {
            addCriterion("related_tel in", values, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelNotIn(List<String> values) {
            addCriterion("related_tel not in", values, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelBetween(String value1, String value2) {
            addCriterion("related_tel between", value1, value2, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedTelNotBetween(String value1, String value2) {
            addCriterion("related_tel not between", value1, value2, "relatedTel");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeIsNull() {
            addCriterion("related_office is null");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeIsNotNull() {
            addCriterion("related_office is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeEqualTo(String value) {
            addCriterion("related_office =", value, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeNotEqualTo(String value) {
            addCriterion("related_office <>", value, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeGreaterThan(String value) {
            addCriterion("related_office >", value, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("related_office >=", value, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeLessThan(String value) {
            addCriterion("related_office <", value, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeLessThanOrEqualTo(String value) {
            addCriterion("related_office <=", value, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeLike(String value) {
            addCriterion("related_office like", value, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeNotLike(String value) {
            addCriterion("related_office not like", value, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeIn(List<String> values) {
            addCriterion("related_office in", values, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeNotIn(List<String> values) {
            addCriterion("related_office not in", values, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeBetween(String value1, String value2) {
            addCriterion("related_office between", value1, value2, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedOfficeNotBetween(String value1, String value2) {
            addCriterion("related_office not between", value1, value2, "relatedOffice");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryIsNull() {
            addCriterion("related_salary is null");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryIsNotNull() {
            addCriterion("related_salary is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryEqualTo(BigDecimal value) {
            addCriterion("related_salary =", value, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryNotEqualTo(BigDecimal value) {
            addCriterion("related_salary <>", value, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryGreaterThan(BigDecimal value) {
            addCriterion("related_salary >", value, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("related_salary >=", value, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryLessThan(BigDecimal value) {
            addCriterion("related_salary <", value, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("related_salary <=", value, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryIn(List<BigDecimal> values) {
            addCriterion("related_salary in", values, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryNotIn(List<BigDecimal> values) {
            addCriterion("related_salary not in", values, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("related_salary between", value1, value2, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andRelatedSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("related_salary not between", value1, value2, "relatedSalary");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryIsNull() {
            addCriterion("hold_category is null");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryIsNotNull() {
            addCriterion("hold_category is not null");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryEqualTo(String value) {
            addCriterion("hold_category =", value, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryNotEqualTo(String value) {
            addCriterion("hold_category <>", value, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryGreaterThan(String value) {
            addCriterion("hold_category >", value, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("hold_category >=", value, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryLessThan(String value) {
            addCriterion("hold_category <", value, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryLessThanOrEqualTo(String value) {
            addCriterion("hold_category <=", value, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryLike(String value) {
            addCriterion("hold_category like", value, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryNotLike(String value) {
            addCriterion("hold_category not like", value, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryIn(List<String> values) {
            addCriterion("hold_category in", values, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryNotIn(List<String> values) {
            addCriterion("hold_category not in", values, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryBetween(String value1, String value2) {
            addCriterion("hold_category between", value1, value2, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldCategoryNotBetween(String value1, String value2) {
            addCriterion("hold_category not between", value1, value2, "holdCategory");
            return (Criteria) this;
        }

        public Criteria andHoldAmountIsNull() {
            addCriterion("hold_amount is null");
            return (Criteria) this;
        }

        public Criteria andHoldAmountIsNotNull() {
            addCriterion("hold_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHoldAmountEqualTo(BigDecimal value) {
            addCriterion("hold_amount =", value, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountNotEqualTo(BigDecimal value) {
            addCriterion("hold_amount <>", value, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountGreaterThan(BigDecimal value) {
            addCriterion("hold_amount >", value, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_amount >=", value, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountLessThan(BigDecimal value) {
            addCriterion("hold_amount <", value, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_amount <=", value, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountIn(List<BigDecimal> values) {
            addCriterion("hold_amount in", values, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountNotIn(List<BigDecimal> values) {
            addCriterion("hold_amount not in", values, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_amount between", value1, value2, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_amount not between", value1, value2, "holdAmount");
            return (Criteria) this;
        }

        public Criteria andHoldSharesIsNull() {
            addCriterion("hold_shares is null");
            return (Criteria) this;
        }

        public Criteria andHoldSharesIsNotNull() {
            addCriterion("hold_shares is not null");
            return (Criteria) this;
        }

        public Criteria andHoldSharesEqualTo(Long value) {
            addCriterion("hold_shares =", value, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesNotEqualTo(Long value) {
            addCriterion("hold_shares <>", value, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesGreaterThan(Long value) {
            addCriterion("hold_shares >", value, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesGreaterThanOrEqualTo(Long value) {
            addCriterion("hold_shares >=", value, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesLessThan(Long value) {
            addCriterion("hold_shares <", value, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesLessThanOrEqualTo(Long value) {
            addCriterion("hold_shares <=", value, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesIn(List<Long> values) {
            addCriterion("hold_shares in", values, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesNotIn(List<Long> values) {
            addCriterion("hold_shares not in", values, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesBetween(Long value1, Long value2) {
            addCriterion("hold_shares between", value1, value2, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldSharesNotBetween(Long value1, Long value2) {
            addCriterion("hold_shares not between", value1, value2, "holdShares");
            return (Criteria) this;
        }

        public Criteria andHoldRatioIsNull() {
            addCriterion("hold_ratio is null");
            return (Criteria) this;
        }

        public Criteria andHoldRatioIsNotNull() {
            addCriterion("hold_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andHoldRatioEqualTo(BigDecimal value) {
            addCriterion("hold_ratio =", value, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioNotEqualTo(BigDecimal value) {
            addCriterion("hold_ratio <>", value, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioGreaterThan(BigDecimal value) {
            addCriterion("hold_ratio >", value, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_ratio >=", value, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioLessThan(BigDecimal value) {
            addCriterion("hold_ratio <", value, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hold_ratio <=", value, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioIn(List<BigDecimal> values) {
            addCriterion("hold_ratio in", values, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioNotIn(List<BigDecimal> values) {
            addCriterion("hold_ratio not in", values, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_ratio between", value1, value2, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andHoldRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hold_ratio not between", value1, value2, "holdRatio");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrIsNull() {
            addCriterion("related_addr is null");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrIsNotNull() {
            addCriterion("related_addr is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrEqualTo(String value) {
            addCriterion("related_addr =", value, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrNotEqualTo(String value) {
            addCriterion("related_addr <>", value, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrGreaterThan(String value) {
            addCriterion("related_addr >", value, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrGreaterThanOrEqualTo(String value) {
            addCriterion("related_addr >=", value, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrLessThan(String value) {
            addCriterion("related_addr <", value, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrLessThanOrEqualTo(String value) {
            addCriterion("related_addr <=", value, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrLike(String value) {
            addCriterion("related_addr like", value, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrNotLike(String value) {
            addCriterion("related_addr not like", value, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrIn(List<String> values) {
            addCriterion("related_addr in", values, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrNotIn(List<String> values) {
            addCriterion("related_addr not in", values, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrBetween(String value1, String value2) {
            addCriterion("related_addr between", value1, value2, "relatedAddr");
            return (Criteria) this;
        }

        public Criteria andRelatedAddrNotBetween(String value1, String value2) {
            addCriterion("related_addr not between", value1, value2, "relatedAddr");
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