package com.example.inspection.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "trade_units", schema = "inspection")
public class TradeUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trade_name", nullable = false)
    private String tradeName;

    @Column(name = "shift_value", nullable = false)
    private Integer shiftValue; // 1-3

    @Column(name = "unit_value", nullable = false)
    private Integer unitValue; // 1-12

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inspection_form_id")
    private InspectionForm inspectionForm;

    public TradeUnit() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTradeName() { return tradeName; }
    public void setTradeName(String tradeName) { this.tradeName = tradeName; }

    public Integer getShiftValue() { return shiftValue; }
    public void setShiftValue(Integer shiftValue) { this.shiftValue = shiftValue; }

    public Integer getUnitValue() { return unitValue; }
    public void setUnitValue(Integer unitValue) { this.unitValue = unitValue; }

    public InspectionForm getInspectionForm() { return inspectionForm; }
    public void setInspectionForm(InspectionForm inspectionForm) { this.inspectionForm = inspectionForm; }
}
