package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value=0;
        do {
            System.out.println("Введите количество инвентаря");
            System.out.println("Введите количество инвентаря");

            value = getIntFromConsole(scanner, scanner.next());

            if (value > 0)
                break;

        } while(true);

        Inventory[] arrayOfInventories = new Inventory[value];

        for (int i=0; i<value; i++) {
            int value_console;
            do {
                System.out.println("""
                        Выберите инвентарь: 
                        1 - Штанга
                        2 - Гиря
                        3 - Ракетка
                        4 - Метательное копье
                        5 - Теннисный мяч
                        6 - Волейбольный мяч""");

                value_console = getIntFromConsole(scanner, scanner.next());

                if (value_console > 0 && value_console < 7)
                    break;

            } while (true);

            if (value_console == 1) arrayOfInventories[i] = new GymBar();
            else if (value_console == 2) arrayOfInventories[i] = new KettleBell();
            else if (value_console == 3) arrayOfInventories[i] = new Rocket();
            else if (value_console == 4) arrayOfInventories[i] = new Spear();
            else if (value_console == 5) arrayOfInventories[i] = new TennisBall();
            else if (value_console == 6) arrayOfInventories[i] = new VolleyballBall();

            arrayOfInventories[i].init(scanner);
        }

        for (Inventory item : arrayOfInventories) {
            if (item.getSportType() == 1)
                System.out.println(item.toString());
        }
    }


    private static int getIntFromConsole(Scanner scanner, String message) {
        String result = "";

        int length = message.length();
        for (int i = 0; i < length; i++) {
            char character = message.charAt(i);
            if (Character.isDigit(character)) {
                result += character;
            } else if (!result.equals(""))
                return Integer.parseInt(result);
        }

        if (result.equals(""))
            return -1;
        else
            return Integer.parseInt(result);
    }
}
