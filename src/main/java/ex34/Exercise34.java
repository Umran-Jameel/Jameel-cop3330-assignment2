/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Umran Jameel
 */
package ex34;
import java.util.*;

public class Exercise34 {
    public static void main(String[] args) {
        String[] arr = new String[5];

        arr[0] = "John Smith";
        arr[1] = "Jackie Jackson";
        arr[2] = "Chris Jones";
        arr[3] = "Amanda Cullen";
        arr[4] = "Jeremy Goodwin";

        System.out.println("There are 5 emplyees: ");
        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter an employee name to remove: ");

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        boolean status = removeName(arr, name);
    }

    public static boolean removeName(String[] arr, String name) {
        for (int i = 0; i < 5; i++) {
            if (arr[i].equals(name)) {
                arr[i] = "";
                break;
            }
        }

        System.out.println("There are 4 employees: ");
        for (int i = 0; i < 5; i++) {
            if (!arr[i].isEmpty()) {
                System.out.println(arr[i]);
            }
        }

        return true;
    }
}
