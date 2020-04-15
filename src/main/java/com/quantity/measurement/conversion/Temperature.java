package com.quantity.measurement.conversion;

import com.quantity.measurement.enums.UnitType;
import com.quantity.measurement.model.QuantityMeasurementDAO;

public class Temperature implements UnitConversion{
    @Override
    public Double convertValue(QuantityMeasurementDAO q, UnitType valueOfUnit) {
        if(q.inputUnit.equals(UnitType.FAHRENHEIT))
            return (q.input-32)*valueOfUnit.unitValue;
        return q.input*valueOfUnit.unitValue;
    }
}
