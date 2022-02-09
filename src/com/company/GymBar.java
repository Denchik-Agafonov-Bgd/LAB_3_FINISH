package com.company;

import java.util.Scanner;

//Штанга
public class GymBar extends TrainingItem{

    private String typeGrif;
    private String rigidity;

    public String getTypeGrif() {
        return typeGrif;
    }

    public void setTypeGrif(String typeGrif) {
        this.typeGrif = typeGrif;
    }

    public void setRigidity(String rigidity) {
        this.rigidity = rigidity;
    }

    public String getRigidity() {
        return rigidity;
    }

    public void init(Scanner scanner) {

        super.setSportType(4);

        System.out.println("Введите материал штанги");
        super.setMaterial(scanner.next());

        super.setWeight((int) CheckValue.checkDouble("Введите вес штанги" ,scanner));
        super.setLenght((int) CheckValue.checkDouble("Введите длину штанги" ,scanner));

        System.out.println("Введите покрытие штанги");
        super.setCoverage(scanner.next());

        System.out.println("Введите тип грифа");
        setTypeGrif(scanner.next());

        System.out.println("Введите жесткость грифа");
        setRigidity(scanner.next());
    }

    @Override
    public String toString() {
        return  "\nШтанга: " +
                "\nВид спорта = " + super.getSportType() +
                "\nВес штанги = " + super.getWeight() +
                "\nМатериал штанги = " + super.getMaterial()+
                "\nДлина штанги = " + super.getLenght() +
                "\nПокрытие штанги = " + super.getCoverage() +
                "\nТип грифа = " + getTypeGrif() +
                "\nЖесткость грифа = " + getRigidity();
    }
}
