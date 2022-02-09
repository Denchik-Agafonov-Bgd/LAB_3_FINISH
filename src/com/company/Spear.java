package com.company;

import java.util.Scanner;

//Мет. копье
public class Spear extends Inventory{
    private String material_tip;
    private int winding;

    public String getMaterial_tip() {
        return material_tip;
    }

    public void setMaterial_tip(String material_tip) {
        this.material_tip = material_tip;
    }

    public void setWinding(int winding) {
        if(winding>0)
            this.winding = winding;
    }

    public int getWinding() {
        return winding;
    }

    public void init(Scanner scanner) {

        super.setSportType(3);

        System.out.println("Введите материал копья");
        super.setMaterial(scanner.next());

        super.setWeight((int) CheckValue.checkDouble("Введите вес копья" ,scanner));
        super.setLenght((int) CheckValue.checkDouble("Введите длину копья" ,scanner));

        System.out.println("Введите материал наконечника копья");
        setMaterial_tip(scanner.next());

        setWinding((int) CheckValue.checkDouble("Введите толщину обмотки копья" ,scanner));
    }

    @Override
    public String toString() {
        return  "\nМетательное копье: " +
                "\nВид спорта = " + super.getSportType() +
                "\nВес копья = " + super.getWeight() +
                "\nМатериал копья = " + super.getMaterial()+
                "\nДлина копья = " + super.getLenght() +
                "\nМатериал наконечника копья = " + getMaterial_tip()+
                "\nТолщину обмотки копья = " + getWinding();
    }
}
