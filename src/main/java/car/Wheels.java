package car;

public class Wheels {
    private int quantity;
    private String material;

    public Wheels(int quantity, String material){
        this.quantity = quantity;
        this.material = material;

    }

    public int getQuantity() {
        return quantity;
    }

    public String getMaterial() {
        return material;
    }
}
