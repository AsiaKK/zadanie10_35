package utils;

import domain.CustomObject;

import java.util.Scanner;

public final class MyUtils {

    public static boolean isUniqueInTable(CustomObject newObject, CustomObject[] table) {
        boolean isUnique = true;
        for (int i = 0; isUnique && i < table.length; i++) {
            isUnique = !(newObject.equals(table[i]));
        }
        return isUnique;
    }

    public static CustomObject getDataFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe: ");
        String name = scanner.nextLine();

        System.out.println("Podaj licznik: ");
        int counter = scanner.nextInt();

        CustomObject newCustomObject = new CustomObject(name, counter);
        return newCustomObject;

    }
}
