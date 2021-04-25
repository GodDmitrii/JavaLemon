package PZ;

import java.io.Serializable;

public class Laptop implements Serializable {
    private String model;
    private double price;

    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public Laptop() {
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}
