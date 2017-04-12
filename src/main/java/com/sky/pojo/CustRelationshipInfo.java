package com.sky.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CustRelationshipInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String creator;

    private String modifier;

    private String custNo;

    private String category;

    private String relationType;

    private String relationDetail;

    private Long relationBizId;

    private String relatedCustName;

    private String relatedCertType;

    private String relatedCertNo;

    private String relatedTel;

    private String relatedOffice;

    private BigDecimal relatedSalary;

    private String holdCategory;

    private BigDecimal holdAmount;

    private Long holdShares;

    private BigDecimal holdRatio;

    private String relatedAddr;

    private Integer version;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    public String getRelationDetail() {
        return relationDetail;
    }

    public void setRelationDetail(String relationDetail) {
        this.relationDetail = relationDetail == null ? null : relationDetail.trim();
    }

    public Long getRelationBizId() {
        return relationBizId;
    }

    public void setRelationBizId(Long relationBizId) {
        this.relationBizId = relationBizId;
    }

    public String getRelatedCustName() {
        return relatedCustName;
    }

    public void setRelatedCustName(String relatedCustName) {
        this.relatedCustName = relatedCustName == null ? null : relatedCustName.trim();
    }

    public String getRelatedCertType() {
        return relatedCertType;
    }

    public void setRelatedCertType(String relatedCertType) {
        this.relatedCertType = relatedCertType == null ? null : relatedCertType.trim();
    }

    public String getRelatedCertNo() {
        return relatedCertNo;
    }

    public void setRelatedCertNo(String relatedCertNo) {
        this.relatedCertNo = relatedCertNo == null ? null : relatedCertNo.trim();
    }

    public String getRelatedTel() {
        return relatedTel;
    }

    public void setRelatedTel(String relatedTel) {
        this.relatedTel = relatedTel == null ? null : relatedTel.trim();
    }

    public String getRelatedOffice() {
        return relatedOffice;
    }

    public void setRelatedOffice(String relatedOffice) {
        this.relatedOffice = relatedOffice == null ? null : relatedOffice.trim();
    }

    public BigDecimal getRelatedSalary() {
        return relatedSalary;
    }

    public void setRelatedSalary(BigDecimal relatedSalary) {
        this.relatedSalary = relatedSalary;
    }

    public String getHoldCategory() {
        return holdCategory;
    }

    public void setHoldCategory(String holdCategory) {
        this.holdCategory = holdCategory == null ? null : holdCategory.trim();
    }

    public BigDecimal getHoldAmount() {
        return holdAmount;
    }

    public void setHoldAmount(BigDecimal holdAmount) {
        this.holdAmount = holdAmount;
    }

    public Long getHoldShares() {
        return holdShares;
    }

    public void setHoldShares(Long holdShares) {
        this.holdShares = holdShares;
    }

    public BigDecimal getHoldRatio() {
        return holdRatio;
    }

    public void setHoldRatio(BigDecimal holdRatio) {
        this.holdRatio = holdRatio;
    }

    public String getRelatedAddr() {
        return relatedAddr;
    }

    public void setRelatedAddr(String relatedAddr) {
        this.relatedAddr = relatedAddr == null ? null : relatedAddr.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}