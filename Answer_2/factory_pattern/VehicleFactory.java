package com.company.company_test.bongo_bd.factory_pattern;

import com.company.company_test.bongo_bd.Vehicle;
import com.company.company_test.bongo_bd.Constants_bd;

public class VehicleFactory {

    public Vehicle createVehicle(String vehicleType){

        switch (vehicleType){
            case Constants_bd.TYPE_CAR: {
                System.out.println("Creating Car...");
                return new Car();
            }
            case Constants_bd.TYPE_PLANE:{
                System.out.println("Creating Plane...");
                return new Plane();
            }
            default:{
                System.out.println("Invalid Creation...");
                return null;
            }
        }
    }
}
