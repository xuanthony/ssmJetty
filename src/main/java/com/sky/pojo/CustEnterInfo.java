package com.sky.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class CustEnterInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String creator;

    private String modifier;

    private String custNo;

    private String certType;

    private String certNo;

    private String loanCardNo;

    private String enterScale;

    private String enterProperty;

    private String registerCode;

    private Date validDate;

    private Date registerDate;

    private String registerOrg;

    private String countryTaxNo;

    private String localTaxNo;

    private String enterIndustry;

    private String enterIndustryDetail;

    private BigDecimal yearTotalRevenue;

    private String registerCurency;

    private BigDecimal registerCapital;

    private Date startYear;

    private String registerAddress;

    private String registerAddressDetail;

    private String address;

    private String addressDetail;

    private String addressZipCode;

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

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    public String getLoanCardNo() {
        return loanCardNo;
    }

    public void setLoanCardNo(String loanCardNo) {
        this.loanCardNo = loanCardNo == null ? null : loanCardNo.trim();
    }

    public String getEnterScale() {
        return enterScale;
    }

    public void setEnterScale(String enterScale) {
        this.enterScale = enterScale == null ? null : enterScale.trim();
    }

    public String getEnterProperty() {
        return enterProperty;
    }

    public void setEnterProperty(String enterProperty) {
        this.enterProperty = enterProperty == null ? null : enterProperty.trim();
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode == null ? null : registerCode.trim();
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterOrg() {
        return registerOrg;
    }

    public void setRegisterOrg(String registerOrg) {
        this.registerOrg = registerOrg == null ? null : registerOrg.trim();
    }

    public String getCountryTaxNo() {
        return countryTaxNo;
    }

    public void setCountryTaxNo(String countryTaxNo) {
        this.countryTaxNo = countryTaxNo == null ? null : countryTaxNo.trim();
    }

    public String getLocalTaxNo() {
        return localTaxNo;
    }

    public void setLocalTaxNo(String localTaxNo) {
        this.localTaxNo = localTaxNo == null ? null : localTaxNo.trim();
    }

    public String getEnterIndustry() {
        return enterIndustry;
    }

    public void setEnterIndustry(String enterIndustry) {
        this.enterIndustry = enterIndustry == null ? null : enterIndustry.trim();
    }

    public String getEnterIndustryDetail() {
        return enterIndustryDetail;
    }

    public void setEnterIndustryDetail(String enterIndustryDetail) {
        this.enterIndustryDetail = enterIndustryDetail == null ? null : enterIndustryDetail.trim();
    }

    public BigDecimal getYearTotalRevenue() {
        return yearTotalRevenue;
    }

    public void setYearTotalRevenue(BigDecimal yearTotalRevenue) {
        this.yearTotalRevenue = yearTotalRevenue;
    }

    public String getRegisterCurency() {
        return registerCurency;
    }

    public void setRegisterCurency(String registerCurency) {
        this.registerCurency = registerCurency == null ? null : registerCurency.trim();
    }

    public BigDecimal getRegisterCapital() {
        return registerCapital;
    }

    public void setRegisterCapital(BigDecimal registerCapital) {
        this.registerCapital = registerCapital;
    }

    public Date getStartYear() {
        return startYear;
    }

    public void setStartYear(Date startYear) {
        this.startYear = startYear;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    public String getRegisterAddressDetail() {
        return registerAddressDetail;
    }

    public void setRegisterAddressDetail(String registerAddressDetail) {
        this.registerAddressDetail = registerAddressDetail == null ? null : registerAddressDetail.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getAddressZipCode() {
        return addressZipCode;
    }

    public void setAddressZipCode(String addressZipCode) {
        this.addressZipCode = addressZipCode == null ? null : addressZipCode.trim();
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