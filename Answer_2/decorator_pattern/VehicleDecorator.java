package com.company.company_test.bongo_bd.decorator_pattern;

import com.company.company_test.bongo_bd.Vehicle;

public class VehicleDecorator implements Vehicle {

    protected Vehicle vehicle;

    public VehicleDecorator(Vehicle c){
        this.vehicle=c;
    }

    @Override
    public int set_num_of_wheels() {
        return vehicle.set_num_of_wheels();
    }

    @Override
    public int set_num_of_passengers() {
        return vehicle.set_num_of_passengers();
    }

    @Override
    public boolean has_gas() {
        return vehicle.has_gas();
    }
}
