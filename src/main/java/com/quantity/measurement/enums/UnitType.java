package com.quantity.measurement.enums;

public enum UnitType {
    FEET(12,Units.LENGTH), INCH(1,Units.LENGTH), YARD(36.0,Units.LENGTH),CENTIMETER(1 / 2.54,Units.LENGTH),
    GALLON(3.78,Units.VOLUME), MILLILITRE(1/1000.0,Units.VOLUME), LITRE(1,Units.VOLUME),
    TONNE(1000.0,Units.WEIGHT),KILOGRAM(1,Units.WEIGHT),GRAM(1 / 1000.0,Units.WEIGHT),
    FAHRENHEIT(1/1.8,Units.TEMPERATURE), CELSIUS(1,Units.TEMPERATURE);

    public double unitValue;
    public Units unit;

    UnitType(double unitValue, Units unit) {
        this.unitValue = unitValue;
        this.unit = unit;
    }
}
