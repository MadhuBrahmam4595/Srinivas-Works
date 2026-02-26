package com.example.inspection.model;

import com.example.inspection.entity.AdmissionDetail;

public class AdmissionModel {
    private Long id;
    private String trade;
    private Integer admitted;
    private Integer passed;
    private Integer placed;

    public AdmissionModel() {}

    public AdmissionModel(AdmissionDetail a){
        this.id = a.getId();
        this.trade = a.getTrade();
        this.admitted = a.getAdmitted();
        this.passed = a.getPassed();
        this.placed = a.getPlaced();
    }

    public AdmissionDetail toEntity(){
        AdmissionDetail a = new AdmissionDetail();
        a.setId(this.id);
        a.setTrade(this.trade);
        a.setAdmitted(this.admitted);
        a.setPassed(this.passed);
        a.setPlaced(this.placed);
        return a;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTrade() { return trade; }
    public void setTrade(String trade) { this.trade = trade; }
    public Integer getAdmitted() { return admitted; }
    public void setAdmitted(Integer admitted) { this.admitted = admitted; }
    public Integer getPassed() { return passed; }
    public void setPassed(Integer passed) { this.passed = passed; }
    public Integer getPlaced() { return placed; }
    public void setPlaced(Integer placed) { this.placed = placed; }
}
