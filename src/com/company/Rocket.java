package com.company;

import java.util.Scanner;

public class Rocket extends Inventory{

    private String model;
    private String size;
    private String rigidity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRigidity() {
        return rigidity;
    }

    public void setRigidity(String rigidity) {
        this.rigidity = rigidity;
    }

    public void init(Scanner scanner) {

        super.setSportType(1);

        System.out.println("Введите материал ракетки");
        super.setMaterial(scanner.next());

        super.setWeight((int) CheckValue.checkDouble("Введите вес ракетки" ,scanner));
        super.setLenght((int) CheckValue.checkDouble("Введите длину ракетки" ,scanner));

        System.out.println("Введите модель ракетки");
        setModel(scanner.next());

        System.out.println("Введите размер ракетки");
        setSize(scanner.next());

        System.out.println("Введите жесткость ракетки");
        setRigidity(scanner.next());

    }

    @Override
    public String toString() {
        return  "\nТеннисная ракетка: " +
                "\nВид спорта = " + super.getSportType() +
                "\nВес ракетки = " + super.getWeight() +
                "\nМатериал ракетки = " + super.getMaterial()+
                "\nДлина ракетки = " + super.getLenght() +
                "\nМодель ракетки = " + getModel() +
                "\nРазмер ракетки = " + getSize() +
                "\nЖесткость ракетки = " + getRigidity();
    }
}
