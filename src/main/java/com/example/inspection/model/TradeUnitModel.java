package com.example.inspection.model;

import com.example.inspection.entity.TradeUnit;

public class TradeUnitModel {
    private Long id;
    private String tradeName;
    private Integer shiftValue;
    private Integer unitValue;

    public TradeUnitModel() {}

    public TradeUnitModel(TradeUnit t){
        this.id = t.getId();
        this.tradeName = t.getTradeName();
        this.shiftValue = t.getShiftValue();
        this.unitValue = t.getUnitValue();
    }

    public TradeUnit toEntity(){
        TradeUnit t = new TradeUnit();
        t.setId(this.id);
        t.setTradeName(this.tradeName);
        t.setShiftValue(this.shiftValue);
        t.setUnitValue(this.unitValue);
        return t;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTradeName() { return tradeName; }
    public void setTradeName(String tradeName) { this.tradeName = tradeName; }
    public Integer getShiftValue() { return shiftValue; }
    public void setShiftValue(Integer shiftValue) { this.shiftValue = shiftValue; }
    public Integer getUnitValue() { return unitValue; }
    public void setUnitValue(Integer unitValue) { this.unitValue = unitValue; }
}
