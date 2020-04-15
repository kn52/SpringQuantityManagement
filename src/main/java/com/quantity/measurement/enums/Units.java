package com.quantity.measurement.enums;

import com.quantity.measurement.conversion.*;

public enum Units {
    LENGTH{
        @Override
        public UnitConversion getClassObject(){
            return new Length();
        }
    },VOLUME{
        @Override
        public UnitConversion getClassObject(){
            return new Volume();
        }
    },TEMPERATURE{
        @Override
        public UnitConversion getClassObject(){
            return new Temperature();
        }
    }, WEIGHT{
        @Override
        public UnitConversion getClassObject(){
            return new Weight();
        }
    };

    public abstract UnitConversion getClassObject();
}
