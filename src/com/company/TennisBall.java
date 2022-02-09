package com.company;

import java.util.Scanner;

public class TennisBall extends Ball {
    //отскок мяча
    private int rebound;

    public int getRebound() {
        return rebound;
    }

    public void setRebound(int rebound) {
        if(rebound>0)
            this.rebound = rebound;
    }

    public void init(Scanner scanner) {
        super.setSportType(1);

        System.out.println("Введите цвет теннисного мяча");
        super.setColor(scanner.next());

        System.out.println("Введите материал теннисного мяча");
        super.setMaterial(scanner.next());
        super.setLenght((int) CheckValue.checkDouble("Введите радиус теннисного мяча", scanner));
        super.setWeight((int) CheckValue.checkDouble("Введите вес теннисного мяча" ,scanner));
        setRebound((int) CheckValue.checkDouble("Введите отскок теннисного мяча", scanner));
    }

    @Override
    public String toString() {
        return  "\nТеннисный мяч: " +
                "\nВид спорта = " + super.getSportType() +
                "\nВес мяча = " + super.getWeight() +
                "\nМатериал мяча = " + super.getMaterial() +
                "\nЦвет мяча = " + super.getColor()+
                "\nРадиус мяча = " + super.getLenght() +
                "\nОтскок мяча = " + getRebound();
    }
}
