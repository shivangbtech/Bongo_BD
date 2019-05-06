package com.company.company_test.bongo_bd.decorator_pattern;

import com.company.company_test.bongo_bd.Vehicle;

public class SportsCar extends VehicleDecorator {

    public SportsCar(Vehicle c) {
        super(c);
    }

    @Override
    public int set_num_of_wheels() {
         super.set_num_of_wheels();
         return 4;
    }

    @Override
    public int set_num_of_passengers() {
        super.set_num_of_passengers();
        return 2;
    }

    @Override
    public boolean has_gas() {
        super.has_gas();
        return true;
    }
}
