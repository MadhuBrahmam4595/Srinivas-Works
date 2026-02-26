package com.example.inspection.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "admission_details", schema = "inspection")
public class AdmissionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trade", nullable = false)
    private String trade;

    @Column(name = "year")
    private Integer year;

    @Column(name = "admitted")
    private Integer admitted;

    @Column(name = "passed")
    private Integer passed;

    @Column(name = "placed")
    private Integer placed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inspection_form_id")
    private InspectionForm inspectionForm;

    public AdmissionDetail() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTrade() { return trade; }
    public void setTrade(String trade) { this.trade = trade; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    public Integer getAdmitted() { return admitted; }
    public void setAdmitted(Integer admitted) { this.admitted = admitted; }

    public Integer getPassed() { return passed; }
    public void setPassed(Integer passed) { this.passed = passed; }

    public Integer getPlaced() { return placed; }
    public void setPlaced(Integer placed) { this.placed = placed; }

    public InspectionForm getInspectionForm() { return inspectionForm; }
    public void setInspectionForm(InspectionForm inspectionForm) { this.inspectionForm = inspectionForm; }
}
