package com.sky.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustEnterInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustEnterInfoExample() {
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

        public Criteria andCertTypeIsNull() {
            addCriterion("cert_type is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("cert_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("cert_type =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("cert_type <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("cert_type >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cert_type >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("cert_type <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("cert_type <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("cert_type like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("cert_type not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("cert_type in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("cert_type not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("cert_type between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("cert_type not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoIsNull() {
            addCriterion("loan_card_no is null");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoIsNotNull() {
            addCriterion("loan_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoEqualTo(String value) {
            addCriterion("loan_card_no =", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoNotEqualTo(String value) {
            addCriterion("loan_card_no <>", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoGreaterThan(String value) {
            addCriterion("loan_card_no >", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("loan_card_no >=", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoLessThan(String value) {
            addCriterion("loan_card_no <", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoLessThanOrEqualTo(String value) {
            addCriterion("loan_card_no <=", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoLike(String value) {
            addCriterion("loan_card_no like", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoNotLike(String value) {
            addCriterion("loan_card_no not like", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoIn(List<String> values) {
            addCriterion("loan_card_no in", values, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoNotIn(List<String> values) {
            addCriterion("loan_card_no not in", values, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoBetween(String value1, String value2) {
            addCriterion("loan_card_no between", value1, value2, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoNotBetween(String value1, String value2) {
            addCriterion("loan_card_no not between", value1, value2, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andEnterScaleIsNull() {
            addCriterion("enter_scale is null");
            return (Criteria) this;
        }

        public Criteria andEnterScaleIsNotNull() {
            addCriterion("enter_scale is not null");
            return (Criteria) this;
        }

        public Criteria andEnterScaleEqualTo(String value) {
            addCriterion("enter_scale =", value, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleNotEqualTo(String value) {
            addCriterion("enter_scale <>", value, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleGreaterThan(String value) {
            addCriterion("enter_scale >", value, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleGreaterThanOrEqualTo(String value) {
            addCriterion("enter_scale >=", value, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleLessThan(String value) {
            addCriterion("enter_scale <", value, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleLessThanOrEqualTo(String value) {
            addCriterion("enter_scale <=", value, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleLike(String value) {
            addCriterion("enter_scale like", value, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleNotLike(String value) {
            addCriterion("enter_scale not like", value, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleIn(List<String> values) {
            addCriterion("enter_scale in", values, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleNotIn(List<String> values) {
            addCriterion("enter_scale not in", values, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleBetween(String value1, String value2) {
            addCriterion("enter_scale between", value1, value2, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterScaleNotBetween(String value1, String value2) {
            addCriterion("enter_scale not between", value1, value2, "enterScale");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyIsNull() {
            addCriterion("enter_property is null");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyIsNotNull() {
            addCriterion("enter_property is not null");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyEqualTo(String value) {
            addCriterion("enter_property =", value, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyNotEqualTo(String value) {
            addCriterion("enter_property <>", value, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyGreaterThan(String value) {
            addCriterion("enter_property >", value, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("enter_property >=", value, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyLessThan(String value) {
            addCriterion("enter_property <", value, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyLessThanOrEqualTo(String value) {
            addCriterion("enter_property <=", value, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyLike(String value) {
            addCriterion("enter_property like", value, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyNotLike(String value) {
            addCriterion("enter_property not like", value, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyIn(List<String> values) {
            addCriterion("enter_property in", values, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyNotIn(List<String> values) {
            addCriterion("enter_property not in", values, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyBetween(String value1, String value2) {
            addCriterion("enter_property between", value1, value2, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andEnterPropertyNotBetween(String value1, String value2) {
            addCriterion("enter_property not between", value1, value2, "enterProperty");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIsNull() {
            addCriterion("register_code is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIsNotNull() {
            addCriterion("register_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeEqualTo(String value) {
            addCriterion("register_code =", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotEqualTo(String value) {
            addCriterion("register_code <>", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeGreaterThan(String value) {
            addCriterion("register_code >", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("register_code >=", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLessThan(String value) {
            addCriterion("register_code <", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLessThanOrEqualTo(String value) {
            addCriterion("register_code <=", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLike(String value) {
            addCriterion("register_code like", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotLike(String value) {
            addCriterion("register_code not like", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIn(List<String> values) {
            addCriterion("register_code in", values, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotIn(List<String> values) {
            addCriterion("register_code not in", values, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeBetween(String value1, String value2) {
            addCriterion("register_code between", value1, value2, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotBetween(String value1, String value2) {
            addCriterion("register_code not between", value1, value2, "registerCode");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(Date value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(Date value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(Date value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(Date value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(Date value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<Date> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<Date> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(Date value1, Date value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(Date value1, Date value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgIsNull() {
            addCriterion("register_org is null");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgIsNotNull() {
            addCriterion("register_org is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgEqualTo(String value) {
            addCriterion("register_org =", value, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgNotEqualTo(String value) {
            addCriterion("register_org <>", value, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgGreaterThan(String value) {
            addCriterion("register_org >", value, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgGreaterThanOrEqualTo(String value) {
            addCriterion("register_org >=", value, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgLessThan(String value) {
            addCriterion("register_org <", value, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgLessThanOrEqualTo(String value) {
            addCriterion("register_org <=", value, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgLike(String value) {
            addCriterion("register_org like", value, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgNotLike(String value) {
            addCriterion("register_org not like", value, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgIn(List<String> values) {
            addCriterion("register_org in", values, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgNotIn(List<String> values) {
            addCriterion("register_org not in", values, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgBetween(String value1, String value2) {
            addCriterion("register_org between", value1, value2, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andRegisterOrgNotBetween(String value1, String value2) {
            addCriterion("register_org not between", value1, value2, "registerOrg");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoIsNull() {
            addCriterion("country_tax_no is null");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoIsNotNull() {
            addCriterion("country_tax_no is not null");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoEqualTo(String value) {
            addCriterion("country_tax_no =", value, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoNotEqualTo(String value) {
            addCriterion("country_tax_no <>", value, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoGreaterThan(String value) {
            addCriterion("country_tax_no >", value, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("country_tax_no >=", value, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoLessThan(String value) {
            addCriterion("country_tax_no <", value, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoLessThanOrEqualTo(String value) {
            addCriterion("country_tax_no <=", value, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoLike(String value) {
            addCriterion("country_tax_no like", value, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoNotLike(String value) {
            addCriterion("country_tax_no not like", value, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoIn(List<String> values) {
            addCriterion("country_tax_no in", values, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoNotIn(List<String> values) {
            addCriterion("country_tax_no not in", values, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoBetween(String value1, String value2) {
            addCriterion("country_tax_no between", value1, value2, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andCountryTaxNoNotBetween(String value1, String value2) {
            addCriterion("country_tax_no not between", value1, value2, "countryTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIsNull() {
            addCriterion("local_tax_no is null");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIsNotNull() {
            addCriterion("local_tax_no is not null");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoEqualTo(String value) {
            addCriterion("local_tax_no =", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotEqualTo(String value) {
            addCriterion("local_tax_no <>", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoGreaterThan(String value) {
            addCriterion("local_tax_no >", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("local_tax_no >=", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLessThan(String value) {
            addCriterion("local_tax_no <", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("local_tax_no <=", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLike(String value) {
            addCriterion("local_tax_no like", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotLike(String value) {
            addCriterion("local_tax_no not like", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIn(List<String> values) {
            addCriterion("local_tax_no in", values, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotIn(List<String> values) {
            addCriterion("local_tax_no not in", values, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoBetween(String value1, String value2) {
            addCriterion("local_tax_no between", value1, value2, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotBetween(String value1, String value2) {
            addCriterion("local_tax_no not between", value1, value2, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryIsNull() {
            addCriterion("enter_industry is null");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryIsNotNull() {
            addCriterion("enter_industry is not null");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryEqualTo(String value) {
            addCriterion("enter_industry =", value, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryNotEqualTo(String value) {
            addCriterion("enter_industry <>", value, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryGreaterThan(String value) {
            addCriterion("enter_industry >", value, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("enter_industry >=", value, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryLessThan(String value) {
            addCriterion("enter_industry <", value, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryLessThanOrEqualTo(String value) {
            addCriterion("enter_industry <=", value, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryLike(String value) {
            addCriterion("enter_industry like", value, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryNotLike(String value) {
            addCriterion("enter_industry not like", value, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryIn(List<String> values) {
            addCriterion("enter_industry in", values, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryNotIn(List<String> values) {
            addCriterion("enter_industry not in", values, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryBetween(String value1, String value2) {
            addCriterion("enter_industry between", value1, value2, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryNotBetween(String value1, String value2) {
            addCriterion("enter_industry not between", value1, value2, "enterIndustry");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailIsNull() {
            addCriterion("enter_industry_detail is null");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailIsNotNull() {
            addCriterion("enter_industry_detail is not null");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailEqualTo(String value) {
            addCriterion("enter_industry_detail =", value, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailNotEqualTo(String value) {
            addCriterion("enter_industry_detail <>", value, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailGreaterThan(String value) {
            addCriterion("enter_industry_detail >", value, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailGreaterThanOrEqualTo(String value) {
            addCriterion("enter_industry_detail >=", value, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailLessThan(String value) {
            addCriterion("enter_industry_detail <", value, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailLessThanOrEqualTo(String value) {
            addCriterion("enter_industry_detail <=", value, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailLike(String value) {
            addCriterion("enter_industry_detail like", value, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailNotLike(String value) {
            addCriterion("enter_industry_detail not like", value, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailIn(List<String> values) {
            addCriterion("enter_industry_detail in", values, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailNotIn(List<String> values) {
            addCriterion("enter_industry_detail not in", values, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailBetween(String value1, String value2) {
            addCriterion("enter_industry_detail between", value1, value2, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andEnterIndustryDetailNotBetween(String value1, String value2) {
            addCriterion("enter_industry_detail not between", value1, value2, "enterIndustryDetail");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueIsNull() {
            addCriterion("year_total_revenue is null");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueIsNotNull() {
            addCriterion("year_total_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueEqualTo(BigDecimal value) {
            addCriterion("year_total_revenue =", value, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueNotEqualTo(BigDecimal value) {
            addCriterion("year_total_revenue <>", value, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueGreaterThan(BigDecimal value) {
            addCriterion("year_total_revenue >", value, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("year_total_revenue >=", value, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueLessThan(BigDecimal value) {
            addCriterion("year_total_revenue <", value, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("year_total_revenue <=", value, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueIn(List<BigDecimal> values) {
            addCriterion("year_total_revenue in", values, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueNotIn(List<BigDecimal> values) {
            addCriterion("year_total_revenue not in", values, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_total_revenue between", value1, value2, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andYearTotalRevenueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_total_revenue not between", value1, value2, "yearTotalRevenue");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyIsNull() {
            addCriterion("register_curency is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyIsNotNull() {
            addCriterion("register_curency is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyEqualTo(String value) {
            addCriterion("register_curency =", value, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyNotEqualTo(String value) {
            addCriterion("register_curency <>", value, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyGreaterThan(String value) {
            addCriterion("register_curency >", value, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyGreaterThanOrEqualTo(String value) {
            addCriterion("register_curency >=", value, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyLessThan(String value) {
            addCriterion("register_curency <", value, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyLessThanOrEqualTo(String value) {
            addCriterion("register_curency <=", value, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyLike(String value) {
            addCriterion("register_curency like", value, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyNotLike(String value) {
            addCriterion("register_curency not like", value, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyIn(List<String> values) {
            addCriterion("register_curency in", values, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyNotIn(List<String> values) {
            addCriterion("register_curency not in", values, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyBetween(String value1, String value2) {
            addCriterion("register_curency between", value1, value2, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCurencyNotBetween(String value1, String value2) {
            addCriterion("register_curency not between", value1, value2, "registerCurency");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIsNull() {
            addCriterion("register_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIsNotNull() {
            addCriterion("register_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalEqualTo(BigDecimal value) {
            addCriterion("register_capital =", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotEqualTo(BigDecimal value) {
            addCriterion("register_capital <>", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalGreaterThan(BigDecimal value) {
            addCriterion("register_capital >", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("register_capital >=", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalLessThan(BigDecimal value) {
            addCriterion("register_capital <", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("register_capital <=", value, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalIn(List<BigDecimal> values) {
            addCriterion("register_capital in", values, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotIn(List<BigDecimal> values) {
            addCriterion("register_capital not in", values, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("register_capital between", value1, value2, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andRegisterCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("register_capital not between", value1, value2, "registerCapital");
            return (Criteria) this;
        }

        public Criteria andStartYearIsNull() {
            addCriterion("start_year is null");
            return (Criteria) this;
        }

        public Criteria andStartYearIsNotNull() {
            addCriterion("start_year is not null");
            return (Criteria) this;
        }

        public Criteria andStartYearEqualTo(Date value) {
            addCriterion("start_year =", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotEqualTo(Date value) {
            addCriterion("start_year <>", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearGreaterThan(Date value) {
            addCriterion("start_year >", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearGreaterThanOrEqualTo(Date value) {
            addCriterion("start_year >=", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearLessThan(Date value) {
            addCriterion("start_year <", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearLessThanOrEqualTo(Date value) {
            addCriterion("start_year <=", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearIn(List<Date> values) {
            addCriterion("start_year in", values, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotIn(List<Date> values) {
            addCriterion("start_year not in", values, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearBetween(Date value1, Date value2) {
            addCriterion("start_year between", value1, value2, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotBetween(Date value1, Date value2) {
            addCriterion("start_year not between", value1, value2, "startYear");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNull() {
            addCriterion("register_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNotNull() {
            addCriterion("register_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressEqualTo(String value) {
            addCriterion("register_address =", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotEqualTo(String value) {
            addCriterion("register_address <>", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThan(String value) {
            addCriterion("register_address >", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("register_address >=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThan(String value) {
            addCriterion("register_address <", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThanOrEqualTo(String value) {
            addCriterion("register_address <=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLike(String value) {
            addCriterion("register_address like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotLike(String value) {
            addCriterion("register_address not like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIn(List<String> values) {
            addCriterion("register_address in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotIn(List<String> values) {
            addCriterion("register_address not in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressBetween(String value1, String value2) {
            addCriterion("register_address between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotBetween(String value1, String value2) {
            addCriterion("register_address not between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailIsNull() {
            addCriterion("register_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailIsNotNull() {
            addCriterion("register_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailEqualTo(String value) {
            addCriterion("register_address_detail =", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailNotEqualTo(String value) {
            addCriterion("register_address_detail <>", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailGreaterThan(String value) {
            addCriterion("register_address_detail >", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("register_address_detail >=", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailLessThan(String value) {
            addCriterion("register_address_detail <", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("register_address_detail <=", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailLike(String value) {
            addCriterion("register_address_detail like", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailNotLike(String value) {
            addCriterion("register_address_detail not like", value, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailIn(List<String> values) {
            addCriterion("register_address_detail in", values, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailNotIn(List<String> values) {
            addCriterion("register_address_detail not in", values, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailBetween(String value1, String value2) {
            addCriterion("register_address_detail between", value1, value2, "registerAddressDetail");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressDetailNotBetween(String value1, String value2) {
            addCriterion("register_address_detail not between", value1, value2, "registerAddressDetail");
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