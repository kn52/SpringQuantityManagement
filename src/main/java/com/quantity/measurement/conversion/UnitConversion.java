package com.quantity.measurement.conversion;

import com.quantity.measurement.enums.UnitType;
import com.quantity.measurement.model.QuantityMeasurementDAO;

public interface UnitConversion {
    public Double convertValue(QuantityMeasurementDAO input, UnitType valueOfUnit);
}
