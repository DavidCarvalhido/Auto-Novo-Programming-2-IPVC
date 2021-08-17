/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pg2_tp;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author David
 */
public class Vehicle implements Serializable {
    
    private static int nCars = 0;
    private int codeCar;
    private String brand;
    private String model;
    private String numPlate;
    private int year;
    private String type;
    private String color;
    private double price;
    private boolean stateVehicle;
    //private User user;

    public Vehicle(String brand, String model, String numPlate, int year, String type, String color, double price, User user) {
        this.codeCar = nCars++;
        this.brand = brand;
        this.model = model;
        this.numPlate = numPlate;
        this.year = year;
        this.type = type;
        this.color = color;
        this.price = price;
        this.stateVehicle = stateVehicle;
    }

    /**
     * @param anCars the nCars to set
     */
    public static void setnCars(int anCars) {
        nCars = anCars;
    }

    /**
     * @return the codeCar
     */
    public int getCodeCar() {
        return codeCar;
    }

    /**
     * @param codeCar the codeCar to set
     */
    public void setCodeCar(int codeCar) {
        this.codeCar = codeCar;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the numPlate
     */
    public String getNumPlate() {
        return numPlate;
    }

    /**
     * @param numPlate the numPlate to set
     */
    public void setNumPlate(String numPlate) {
        this.numPlate = numPlate;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stateVehicle
     */
    public boolean isStateVehicle() {
        return stateVehicle;
    }

    /**
     * @param stateVehicle the stateVehicle to set
     */
    public void setStateVehicle(boolean stateVehicle) {
        this.stateVehicle = stateVehicle;
    }
    
}
