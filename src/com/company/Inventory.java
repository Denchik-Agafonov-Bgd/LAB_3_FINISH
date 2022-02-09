package com.company;

import java.util.Scanner;

public abstract class Inventory {
    private int sportType;
    private int weight;
    private String material;
    private int lenght;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight>0)
            this.weight = weight;
    }

    public int getSportType() {
        return sportType;
    }

    public void setSportType(int sportType) {
        if(sportType>0)
            this.sportType = sportType;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setLenght(int lenght) {
        if(lenght>0)
            this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public abstract void init(Scanner scanner);

}
