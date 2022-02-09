package com.company;

import java.util.Scanner;

public class VolleyballBall extends Ball {
    //Внутр. давление
    private int pressure;


    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure){
        if(pressure>0)
            this.pressure=pressure;
    }

    public void init(Scanner scanner){
        super.setSportType(2);

        System.out.println("Введите цвет воллейбольного мяча");
        super.setColor(scanner.next());

        System.out.println("Введите материал воллейбольного мяча");
        super.setMaterial(scanner.next());

        super.setWeight((int) CheckValue.checkDouble("Введите вес воллейбольного мяча" ,scanner));
        super.setLenght((int) CheckValue.checkDouble("Введите радиус воллейбольного мяча" ,scanner));
        setPressure((int) CheckValue.checkDouble("Введите внутр. давление воллейбольного мяча" ,scanner));
    }

    @Override
    public String toString() {
        return  "\nВоллейбольный мяч: " +
                "\nВид спорта = " + super.getSportType() +
                "\nВес мяча = " + super.getWeight() +
                "\nМатериал мяча = " + super.getMaterial()+
                "\nЦвет мяча = " + super.getColor()+
                "\nРадиус мяча = " + super.getLenght() +
                "\nВнутр. давление мяча = " + getPressure();
    }

}
