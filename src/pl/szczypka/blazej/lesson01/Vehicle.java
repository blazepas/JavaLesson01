package pl.szczypka.blazej.lesson01;

public class Vehicle {
    // double jesty typem prostym inicjalizowanym wartością 0.
    private double weight;
    // String jest typem złożonym, inicjalizowanym wartością null.
    private String name;

    public Vehicle(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
