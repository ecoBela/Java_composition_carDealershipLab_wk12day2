package dealership;

import car.Car;

import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Car> cars;

    public Customer(double money, ArrayList<Car> cars){
        this.money = money;
        this. cars = new ArrayList<Car>();

    }

    public double getMoney() {
        return this.money;
    }
}
