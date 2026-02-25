package com.example.inspection.model;

import com.example.inspection.entity.InspectionForm;
import java.time.LocalDate;

public class InspectionFormModel {
    private Long id;
    private String raoName;
    private String raoDesignation;
    private LocalDate inspectionDate;
    private String itiName;
    private String headName;
    private String postalAddress;
    private String landline;
    private String mobile;
    private String email;
    private String remarks;

    public InspectionFormModel() {}

    public InspectionFormModel(InspectionForm e){
        this.id = e.getId();
        this.raoName = e.getRaoName();
        this.raoDesignation = e.getRaoDesignation();
        this.inspectionDate = e.getInspectionDate();
        this.itiName = e.getItiName();
        this.headName = e.getHeadName();
        this.postalAddress = e.getPostalAddress();
        this.landline = e.getLandline();
        this.mobile = e.getMobile();
        this.email = e.getEmail();
        this.remarks = e.getRemarks();
    }

    public InspectionForm toEntity(){
        InspectionForm e = new InspectionForm();
        e.setId(this.id);
        e.setRaoName(this.raoName);
        e.setRaoDesignation(this.raoDesignation);
        e.setInspectionDate(this.inspectionDate);
        e.setItiName(this.itiName);
        e.setHeadName(this.headName);
        e.setPostalAddress(this.postalAddress);
        e.setLandline(this.landline);
        e.setMobile(this.mobile);
        e.setEmail(this.email);
        e.setRemarks(this.remarks);
        return e;
    }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRaoName() { return raoName; }
    public void setRaoName(String raoName) { this.raoName = raoName; }
    public String getRaoDesignation() { return raoDesignation; }
    public void setRaoDesignation(String raoDesignation) { this.raoDesignation = raoDesignation; }
    public LocalDate getInspectionDate() { return inspectionDate; }
    public void setInspectionDate(LocalDate inspectionDate) { this.inspectionDate = inspectionDate; }
    public String getItiName() { return itiName; }
    public void setItiName(String itiName) { this.itiName = itiName; }
    public String getHeadName() { return headName; }
    public void setHeadName(String headName) { this.headName = headName; }
    public String getPostalAddress() { return postalAddress; }
    public void setPostalAddress(String postalAddress) { this.postalAddress = postalAddress; }
    public String getLandline() { return landline; }
    public void setLandline(String landline) { this.landline = landline; }
    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
}
