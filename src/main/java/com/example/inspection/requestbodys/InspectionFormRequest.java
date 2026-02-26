package com.example.inspection.requestbodys;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.List;

public class InspectionFormRequest {

    @NotBlank
    private String raoName;

    private String raoDesignation;

    @NotNull
    @PastOrPresent
    private LocalDate inspectionDate;

    @NotBlank
    private String itiName;

    @NotBlank
    private String headName;

    @NotBlank
    private String postalAddress;

    @Pattern(regexp = "^[0-9\\s-]{6,15}$", message = "Invalid landline")
    private String landline;

    @NotBlank
    @Pattern(regexp = "[\\d\\s-]{10}", message = "Mobile must be 10 digits")
    private String mobile;

    @NotBlank
    @Email
    private String email;

    private String remarks;

    @Valid
    private List<TradeUnitRequest> tradeUnits;

    @Valid
    private List<AdmissionRequest> admissions;

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

    public List<TradeUnitRequest> getTradeUnits() { return tradeUnits; }
    public void setTradeUnits(List<TradeUnitRequest> tradeUnits) { this.tradeUnits = tradeUnits; }

    public List<AdmissionRequest> getAdmissions() { return admissions; }
    public void setAdmissions(List<AdmissionRequest> admissions) { this.admissions = admissions; }
}
