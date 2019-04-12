package com.example.lazyload;


import com.google.gson.annotations.SerializedName;

public class Tec  {

    @SerializedName(ConstantVariable.Tec.ID)
    private int tecId;
    @SerializedName(ConstantVariable.Tec.TRIP_ID)
    private int tripId;
    @SerializedName(ConstantVariable.UserPrefVar.NAME)
    private String userName;
    @SerializedName(ConstantVariable.Tec.PROJECT_ID)
    private int projectId;
    @SerializedName(ConstantVariable.Tec.PROJECT_NAME)
    private String projectName;
    @SerializedName(ConstantVariable.Tec.CLAIM_START_DATE)
    private String claimStartDate;
    @SerializedName(ConstantVariable.Tec.CLAIM_END_DATE)
    private String claimEndDate;
    @SerializedName(ConstantVariable.Tec.BASE_LOCATION)
    private String baseLocation;
    @SerializedName(ConstantVariable.Tec.SITE_LOCATION)
    private String siteLocation;
    @SerializedName(ConstantVariable.Tec.STATUS)
    private String status;
    @SerializedName(ConstantVariable.Tec.TOTAL_AMOUNT)
    private double totalAmount;
    @SerializedName(ConstantVariable.Tec.DESCRIPTION)
    private String description;
    @SerializedName(ConstantVariable.Tec.CREATED_BY_ID)
    private int createdById;
    @SerializedName(ConstantVariable.Tec.CREATED_DATE)
    private String createdDate;
    @SerializedName(ConstantVariable.Tec.USER_NOTE)
    private String userNote;
    @SerializedName(ConstantVariable.Tec.REMARK)
    private String remark;
    @SerializedName(ConstantVariable.Tec.SUBMIT_BY_ID)
    private int submitById;
    @SerializedName(ConstantVariable.Tec.SUBMIT_DATE)
    private String submitDate;
    @SerializedName(ConstantVariable.Tec.MODIFIED_BY_ID)
    private int modifiedById;
    @SerializedName(ConstantVariable.Tec.MODIFIED_DATE)
    private String modifiedDate;
    @SerializedName(ConstantVariable.Tec.IS_INTERNATIONAL)
    private int isInternational;



    public Tec(int tecId, int tripId, String userName, int projectId, String projectName, String claimStartDate, String claimEndDate, String baseLocation, String siteLocation, String status, double totalAmount, String description, int createdById, String createdDate, String userNote, String remark, int submitById, String submitDate, int modifiedById, String modifiedDate, int isInternational) {
        this.tecId = tecId;
        this.tripId = tripId;
        this.userName = userName;
        this.projectId = projectId;
        this.projectName = projectName;
        this.claimStartDate = claimStartDate;
        this.claimEndDate = claimEndDate;
        this.baseLocation = baseLocation;
        this.siteLocation = siteLocation;
        this.status = status;
        this.totalAmount = totalAmount;
        this.description = description;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.userNote = userNote;
        this.remark = remark;
        this.submitById = submitById;
        this.submitDate = submitDate;
        this.modifiedById = modifiedById;
        this.modifiedDate = modifiedDate;
        this.isInternational = isInternational;
    }



    public int getTecId() {
        return tecId;
    }

    public void setTecId(int tecId) {
        this.tecId = tecId;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getIsInternational() {
        return isInternational;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClaimStartDate() {
        return claimStartDate;
    }

    public void setClaimStartDate(String claimStartDate) {
        this.claimStartDate = claimStartDate;
    }

    public String getClaimEndDate() {
        return claimEndDate;
    }

    public void setClaimEndDate(String claimEndDate) {
        this.claimEndDate = claimEndDate;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public String getSiteLocation() {
        return siteLocation;
    }

    public void setSiteLocation(String siteLocation) {
        this.siteLocation = siteLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSubmitById() {
        return submitById;
    }

    public void setSubmitById(int submitById) {
        this.submitById = submitById;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    public int getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(int modifiedById) {
        this.modifiedById = modifiedById;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }


}
