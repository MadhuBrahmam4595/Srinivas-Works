package com.example.inspection.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "inspection_forms")
public class InspectionForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rao_name", nullable = false)
    private String raoName;

    @Column(name = "rao_designation")
    private String raoDesignation;

    @Column(name = "inspection_date", nullable = false)
    private LocalDate inspectionDate;

    @Column(name = "iti_name", nullable = false)
    private String itiName;

    @Column(name = "head_name", nullable = false)
    private String headName;

    @Column(name = "postal_address", columnDefinition = "text", nullable = false)
    private String postalAddress;

    @Column(name = "landline")
    private String landline;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "remarks", columnDefinition = "text")
    private String remarks;

    @OneToMany(mappedBy = "inspectionForm", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TradeUnit> tradeUnits = new ArrayList<>();

    public InspectionForm() {}

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

    public List<TradeUnit> getTradeUnits() { return tradeUnits; }
    public void setTradeUnits(List<TradeUnit> tradeUnits) { this.tradeUnits = tradeUnits; }

    public void addTradeUnit(TradeUnit t){
        t.setInspectionForm(this);
        this.tradeUnits.add(t);
    }

    public void removeTradeUnit(TradeUnit t){
        t.setInspectionForm(null);
        this.tradeUnits.remove(t);
    }
}
