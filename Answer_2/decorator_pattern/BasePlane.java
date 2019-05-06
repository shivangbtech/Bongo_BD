package com.company.company_test.bongo_bd.decorator_pattern;

import com.company.company_test.bongo_bd.Vehicle;

public class BasePlane implements Vehicle {

    @Override
    public int set_num_of_wheels() {
        return 3;
    }

    @Override
    public int set_num_of_passengers() {
        return 150;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
