import domain.CustomObject;
import utils.MyUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CustomObject[] customsTable = new CustomObject[3];

        for (int i = 0; i < customsTable.length; i++) {
            CustomObject newItem = null;
            boolean isNewItemUnique = false;

            System.out.println("======");
            System.out.println("Zdefiniuj " + i +" element");

            while(!isNewItemUnique){
                System.out.println("--------------------------");
                newItem = MyUtils.getDataFromUser();
                isNewItemUnique = MyUtils.isUniqueInTable(newItem, customsTable);
                if (!isNewItemUnique) {
                    System.out.println("Nowy obiekt jest duplikatem!!!");
                }
            }
            customsTable[i] = newItem;
        }

        System.out.println();
        System.out.println("======================");
        System.out.println("Podsumujmy:");

        for (CustomObject element : customsTable){
            System.out.println(element.toString());
        }
    }
}
