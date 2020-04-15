package com.quantity.measurement.controller;

import com.quantity.measurement.enums.Units;
import com.quantity.measurement.model.QuantityMeasurementDAO;
import com.quantity.measurement.service.IQuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuantityMeasurementController {

    @Autowired
    private IQuantityMeasurementService iQuantityMeasurementService;

    @GetMapping("/quantity/all")
    public List<Enum> getBasicQuantity(){ return iQuantityMeasurementService.getUnits(); }

    @GetMapping("/quantity")
    public List<Enum> getUnitType(@RequestParam(value = "unit") Units units){
        return iQuantityMeasurementService.getSubUnits(units);
    }

    @GetMapping("/quantity/convert")
    public double convert(@RequestBody QuantityMeasurementDAO quantityMeasurementDAO){
        return iQuantityMeasurementService.convertUnit(quantityMeasurementDAO);
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
