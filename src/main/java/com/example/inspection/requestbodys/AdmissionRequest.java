package com.example.inspection.requestbodys;

import jakarta.validation.constraints.*;

public class AdmissionRequest {

    @NotBlank
    private String trade;

    @NotNull
    private Integer year;

    @Min(0)
    private Integer admitted;

    @Min(0)
    private Integer passed;

    @Min(0)
    private Integer placed;

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
}
