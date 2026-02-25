package com.example.inspection.requestbodys;

import jakarta.validation.constraints.*;

public class TradeUnitRequest {

    @NotBlank
    private String tradeName;

    @NotNull
    @Min(1)
    @Max(3)
    private Integer shiftValue;

    @NotNull
    @Min(1)
    @Max(12)
    private Integer unitValue;

    public String getTradeName() { return tradeName; }
    public void setTradeName(String tradeName) { this.tradeName = tradeName; }

    public Integer getShiftValue() { return shiftValue; }
    public void setShiftValue(Integer shiftValue) { this.shiftValue = shiftValue; }

    public Integer getUnitValue() { return unitValue; }
    public void setUnitValue(Integer unitValue) { this.unitValue = unitValue; }
}
