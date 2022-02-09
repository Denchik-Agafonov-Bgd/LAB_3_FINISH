package com.company;

import java.util.Scanner;

//Гиря
public class KettleBell extends TrainingItem{

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void init(Scanner scanner) {

        super.setSportType(4);

        System.out.println("Введите материал гири");
        super.setMaterial(scanner.next());

        super.setWeight((int) CheckValue.checkDouble("Введите вес гири" ,scanner));
        super.setLenght((int) CheckValue.checkDouble("Введите длину гири" ,scanner));

        System.out.println("Введите покрытие гири");
        super.setCoverage(scanner.next());

        System.out.println("Введите тип гири");
        setType(scanner.next());

    }
    @Override
    public String toString() {
        return  "\nГиря: " +
                "\nВид спорта = " + super.getSportType() +
                "\nВес гири = " + super.getWeight() +
                "\nМатериал гири = " + super.getMaterial()+
                "\nДлина гири = " + super.getLenght() +
                "\nПокрытие гири = " + super.getCoverage() +
                "\nТип гири = " + getType();
    }
}
