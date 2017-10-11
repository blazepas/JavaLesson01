package pl.szczypka.blazej.lesson01;

public class Highway {

    private String name;
    private double length;

    private Vehicle fiatCar = new Vehicle("Fiat", 1000);
    private Vehicle mazdaCar = new Vehicle("Mazda", 1900);
    private Vehicle solarisBus;

    public double totalVehiclesWeight(){
        double totalWeight;
        totalWeight = fiatCar.getWeight() + mazdaCar.getWeight();
        return totalWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
