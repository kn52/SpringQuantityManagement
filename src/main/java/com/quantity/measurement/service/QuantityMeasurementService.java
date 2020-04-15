package com.quantity.measurement.service;

import com.quantity.measurement.enums.UnitType;
import com.quantity.measurement.enums.Units;
import com.quantity.measurement.model.QuantityMeasurementDAO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuantityMeasurementService implements IQuantityMeasurementService {

    @Override
    public List<Enum> getUnits() {
        return new ArrayList(Arrays.asList(Units.values()));
    }

    @Override
    public List<Enum> getSubUnits(Units unitType) {
        ArrayList<Enum> list=new ArrayList<>();
        for (UnitType type : UnitType.values()) {
            if (type.unit.equals(unitType))
                list.add(type);
        }
        return list;
    }

    @Override
    public double convertUnit(QuantityMeasurementDAO q) {
        return q.inputBasicUnit.getClassObject().convertValue(q,q.inputUnit);
    }
}
