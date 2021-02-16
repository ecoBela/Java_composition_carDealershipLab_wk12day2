package car;

public class Seats {
    private int quantity;
    private String lining;

    public Seats(int quantity, String lining){
        this.quantity = quantity;
        this.lining = lining;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLining() {
        return lining;
    }
}
