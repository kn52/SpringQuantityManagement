package com.quantity.measurement.model;

import com.quantity.measurement.enums.UnitType;
import com.quantity.measurement.enums.Units;

public class QuantityMeasurementDAO {
    public double input;
    public UnitType inputUnit;
    public Units inputBasicUnit;
    public UnitType inputConversion;

    public QuantityMeasurementDAO(double input, UnitType inputUnit, Units inputBasicUnit, UnitType inputConversion) {
        this.input = input;
        this.inputUnit = inputUnit;
        this.inputBasicUnit = inputBasicUnit;
        this.inputConversion = inputConversion;
    }

    public double getInput() {
        return input;
    }

    public UnitType getInputUnit() {
        return inputUnit;
    }

    public Units getInputBasicUnit() {
        return inputBasicUnit;
    }

    public UnitType getInputConversion() {
        return inputConversion;
    }
}
