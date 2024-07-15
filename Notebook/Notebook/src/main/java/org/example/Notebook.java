package org.example;

public class Notebook {
    private String model;
    private String purpose;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    private double price;

    public Notebook(String model, String purpose, int ram, int hdd, String os, String color, double price) {
        this.model = model;
        this.purpose = purpose;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getModel() { return model; }
    public String getPurpose() { return purpose; }
    public int getRam() { return ram; }
    public int getHdd() { return hdd; }
    public String getOs() { return os; }
    public String getColor() { return color; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", purpose='" + purpose + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
