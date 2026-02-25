package com.example.inspection.controller;

import com.example.inspection.entity.InspectionForm;
import com.example.inspection.model.InspectionFormModel;
import com.example.inspection.repo.InspectionFormRepository;
import com.example.inspection.requestbodys.InspectionFormRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/forms")
@CrossOrigin(origins = "*")
public class FormController {

    private final InspectionFormRepository repo;

    public FormController(InspectionFormRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public ResponseEntity<InspectionFormModel> create(@Valid @RequestBody InspectionFormRequest req){
        InspectionForm e = new InspectionForm();
        e.setRaoName(req.getRaoName());
        e.setRaoDesignation(req.getRaoDesignation());
        e.setInspectionDate(req.getInspectionDate());
        e.setItiName(req.getItiName());
        e.setHeadName(req.getHeadName());
        e.setPostalAddress(req.getPostalAddress());
        e.setLandline(req.getLandline());
        e.setMobile(req.getMobile());
        e.setEmail(req.getEmail());
        e.setRemarks(req.getRemarks());

        // map trade units if present
        if(req.getTradeUnits() != null){
            req.getTradeUnits().forEach(treq -> {
                com.example.inspection.entity.TradeUnit tu = new com.example.inspection.entity.TradeUnit();
                tu.setTradeName(treq.getTradeName());
                tu.setShiftValue(treq.getShiftValue());
                tu.setUnitValue(treq.getUnitValue());
                e.addTradeUnit(tu);
            });
        }

        InspectionForm saved = repo.save(e);
        InspectionFormModel model = new InspectionFormModel(saved);
        return ResponseEntity.ok(model);
    }
}
