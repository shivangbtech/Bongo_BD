package com.company.company_test.bongo_bd.decorator_pattern;

import com.company.company_test.bongo_bd.Vehicle;

public class BaseCar implements Vehicle {

    @Override
    public int set_num_of_wheels() {
        return 4;
    }

    @Override
    public int set_num_of_passengers() {
        return 1;
    }

    @Override
    public boolean has_gas() {
        return false;
    }
}
