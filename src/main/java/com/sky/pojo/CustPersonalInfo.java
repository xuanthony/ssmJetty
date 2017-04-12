package com.sky.pojo;

import java.util.Date;

public class CustPersonalInfo {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String creator;

    private String modifier;

    private String custNo;

    private String gender;

    private String marriage;

    private String eduLevel;

    private String permResidencePosition;

    private String permResidenceDetail;

    private String address;

    private String addressDetail;

    private String addressZipCode;

    private String homeAddressRegion;

    private String homeAddressDetail;

    private String homeAddressZipCode;

    private Integer liveYear;

    private String liveCondition;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel == null ? null : eduLevel.trim();
    }

    public String getPermResidencePosition() {
        return permResidencePosition;
    }

    public void setPermResidencePosition(String permResidencePosition) {
        this.permResidencePosition = permResidencePosition == null ? null : permResidencePosition.trim();
    }

    public String getPermResidenceDetail() {
        return permResidenceDetail;
    }

    public void setPermResidenceDetail(String permResidenceDetail) {
        this.permResidenceDetail = permResidenceDetail == null ? null : permResidenceDetail.trim();
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

    public String getHomeAddressRegion() {
        return homeAddressRegion;
    }

    public void setHomeAddressRegion(String homeAddressRegion) {
        this.homeAddressRegion = homeAddressRegion == null ? null : homeAddressRegion.trim();
    }

    public String getHomeAddressDetail() {
        return homeAddressDetail;
    }

    public void setHomeAddressDetail(String homeAddressDetail) {
        this.homeAddressDetail = homeAddressDetail == null ? null : homeAddressDetail.trim();
    }

    public String getHomeAddressZipCode() {
        return homeAddressZipCode;
    }

    public void setHomeAddressZipCode(String homeAddressZipCode) {
        this.homeAddressZipCode = homeAddressZipCode == null ? null : homeAddressZipCode.trim();
    }

    public Integer getLiveYear() {
        return liveYear;
    }

    public void setLiveYear(Integer liveYear) {
        this.liveYear = liveYear;
    }

    public String getLiveCondition() {
        return liveCondition;
    }

    public void setLiveCondition(String liveCondition) {
        this.liveCondition = liveCondition == null ? null : liveCondition.trim();
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