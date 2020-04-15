package com.quantity.measurement.service;

import com.quantity.measurement.enums.Units;
import com.quantity.measurement.model.QuantityMeasurementDAO;

import java.util.List;

public interface IQuantityMeasurementService {
    List<Enum> getUnits();

    List<Enum> getSubUnits(Units unitType);

    double convertUnit(QuantityMeasurementDAO quantityMeasurementDAO);
}
