package org.homework;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine ("Diesel",150);

        Car myCar = new Car("BMW", 250, "Germany", 2022,carEngine);


        System.out.println("Модель: " + myCar.getModel());
        System.out.println("Максимальна швидкість: " + myCar.getMaxSpeed());
        System.out.println("Країна виробництва: " + myCar.getCountryOfManufacture());
        System.out.println("Рік виробництва: " + myCar.getYearOfManufacture());
        System.out.println("Двигун:" + myCar.getEngine().getType());
        System.out.println("Потужність:" + myCar.getEngine().getHorsepower());

        myCar.gas();
        myCar.brake();
    }
    }

