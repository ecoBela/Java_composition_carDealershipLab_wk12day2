package car;

public class Tyres {
    private double treadWear;
    private String tyreType;

    public Tyres(double treadWear, String tyreType){
        this.treadWear = treadWear;
        this.tyreType = tyreType;
    }

    public double getTreadWear() {
        return treadWear;
    }

    public String getTyreType() {
        return tyreType;
    }
}
