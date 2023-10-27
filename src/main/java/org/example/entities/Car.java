package org.example.entities;

public class Car {
    private int id;
    private String name;
    private int model;

    private String brand;
    private double unitPrice;
    private int unitInStock;
    private boolean isInStock;

    public Car() {
    }

    public Car(int id,String name, int model, String brand, double unitPrice, int unitInStock, boolean isInStock) {
        this.id=id;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.isInStock = isInStock;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public boolean getIsInStock() {
        if(unitInStock==0)
            isInStock=false;
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
