package car;

public class Car {
    private VehicleType vehicleType;
    private Tyres tyres;
    private Wheels wheels;
    private Seats seats;
    private Doors doors;
    private Engine engine;

    public Car(VehicleType vehicleType, Tyres tyres, Wheels wheels, Seats seats, Doors doors, Engine engine){
        this.vehicleType = vehicleType;
        this.tyres = tyres;
        this.wheels = wheels;
        this.seats = seats;
        this.doors = doors;
        this.engine = engine;
    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
