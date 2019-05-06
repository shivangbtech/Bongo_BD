package com.company.company_test.bongo_bd.factory_pattern;

import com.company.company_test.bongo_bd.Constants_bd;

public class Solution {

    /**
     * a) Explain how can you use the pattern to create car and plane class?
     *
     * The design pattern that has been here is factory design pattern.To create a car and a plane class,we'll
     * simply keep Vehicle class as a base class.The key point of factory design pattern is we define a class type/interface and then
     * we will have number of subclasses which implement the contract defined by the base class. We also create a class as Vehicle Factory
     * that create the vehicle based on type. Here the subclasses are Car and Plane class
     *
     * @param vehicleType
     */

    public void vehicleSolution(String vehicleType) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleFactory.createVehicle(vehicleType);
        System.out.println("Creation done...");
    }

//    public static void main(String[] args){
//        Solution solution = new Solution();
//        solution.vehicleSolution(Constants_bd.TYPE_PLANE);
//    }
}


