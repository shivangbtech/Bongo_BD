package com.company.company_test.bongo_bd.factory_pattern;

import com.company.company_test.bongo_bd.Vehicle;

public class Plane implements Vehicle {

    @Override
    public int set_num_of_wheels() {
        return 3;
    }

    @Override
    public int set_num_of_passengers() {
        return 250;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
