package com.designpatterns.builder;

import java.util.List;

public class Car {

    String company;
    String model;
    double engine;
    int year;
    long mileage;
    String countryOfOrigin;
    List<String> additionalFeatures;
    EngineType engineType;

    public Car(String company, String model, double engine, int year, long mileage, String countryOfOrigin, List<String> additionalFeatures, EngineType engineType) {
        this.company = company;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.mileage = mileage;
        this.countryOfOrigin = countryOfOrigin;
        this.additionalFeatures = additionalFeatures;
        this.engineType = engineType;
    }

    public static class CarBuilder {

        String company;
        String model;
        double engine;
        int year;
        long mileage;
        String countryOfOrigin;
        List<String> additionalFeatures;
        EngineType engineType;

        public static CarBuilder builder(){
            return new CarBuilder();
        }

        public CarBuilder company (String company) {
            this.company = company;
            return this;
        }

        public CarBuilder model (String model) {
            this.model = model;
            return this;
        }

        public CarBuilder engine (double engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder year (int year) {
            this.year = year;
            return this;
        }

        public CarBuilder mileage (long mileage) {
            this.mileage = mileage;
            return this;
        }

        public CarBuilder countryOfOrigin (String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }

        public CarBuilder additionalFeatures (List<String> additionalFeatures) {
            this.additionalFeatures = additionalFeatures;
            return this;
        }

        public CarBuilder engineType (EngineType engineType) {
            this.engineType = engineType;
            return this;
        }

        public Car build() {
            return new Car(company, model, engine, year, mileage, countryOfOrigin, additionalFeatures, engineType);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                ", mileage=" + mileage +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", additionalFeatures=" + additionalFeatures +
                ", engineType=" + engineType +
                '}';
    }
}
