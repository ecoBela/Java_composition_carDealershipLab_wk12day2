package dealership;

import car.VehicleType;

import java.util.HashMap;

public class Dealership {
    private double till;
    private HashMap<VehicleType, Integer> stock;

    public Dealership(double till, HashMap<VehicleType, Integer> stock){
        this.till = till;
        this.stock = new HashMap<VehicleType, Integer>();

    }

}
