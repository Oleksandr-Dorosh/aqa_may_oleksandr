package org.homework;

import javax.print.attribute.standard.MediaSize;

public class Car {
    private String model;
    private int maxSpeed;
    private String countryOfManufacture;
    private int yearOfManufacture;
    private Engine engine;

    public Car(String model, int maxSpeed, String countryOfManufacture, int yearOfManufacture, Engine engine) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.countryOfManufacture = countryOfManufacture;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public Engine getEngine() {
        return engine;
    }

    public void gas() {
    }

    public void brake() {
    }
}