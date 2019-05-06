package com.company.company_test.bongo_bd.decorator_pattern;

import com.company.company_test.bongo_bd.Vehicle;

/**
 * b) Use a different design pattern for this solution.
 * I will be going to use Decorator design pattern for this solution.
 *
 * Decorator design pattern is used to modify the functionality of an object at runtime. At the same
 * time other instances of the same class will not be affected by this, so individual object gets the
 * modified behavior. Decorator design pattern is one of the structural design pattern and uses abstract
 * classes or interface with composition to implement.
 */

public class Solution {

    public void vehicleSolution(){
        Vehicle car = new SportsCar(new BaseCar());
        Vehicle plane = new CommercialPlane(new BasePlane());
    }


//    public static void main(String[] args){
//        Solution solution = new Solution();
//        solution.vehicleSolution();
//    }

}
