package car;

public enum VehicleType {

    ELECTRIC (50000.00, "red"),
    HYBRID (45000.00, "metallic"),
    PETROL (35000.00, "blue"),
    DIESEL (30000.00, "racing green");

    private final double price;
    private final String colour;

    VehicleType(double price, String colour){
        this.price = price;
        this.colour = colour;
    }


    public double getPrice() {
        return price;
    }


    public String getColour() {
        return colour;
    }
}
