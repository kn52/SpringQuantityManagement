package com.quantity.measurement.conversion;

import com.quantity.measurement.enums.UnitType;
import com.quantity.measurement.model.QuantityMeasurementDAO;

public class Volume implements UnitConversion {
    @Override
    public Double convertValue(QuantityMeasurementDAO q, UnitType valueOfUnit) { return q.input * valueOfUnit.unitValue; }
}
