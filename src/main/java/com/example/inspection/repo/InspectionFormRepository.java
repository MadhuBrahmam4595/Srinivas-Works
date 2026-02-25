package com.example.inspection.repo;

import com.example.inspection.entity.InspectionForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionFormRepository extends JpaRepository<InspectionForm, Long> {

}
