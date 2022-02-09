package com.company;

import java.util.Scanner;

public class CheckValue {

    static double checkDouble(String str, Scanner scanner)
    {
        double temp;
        do {
            System.out.println(str);

            while (!scanner.hasNextDouble()) {
                System.out.println("Это не число!");
                scanner.next();
            }
            temp=scanner.nextDouble();
        }while (temp <= 0);

        return temp;

    }
}
