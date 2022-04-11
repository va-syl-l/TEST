package com.company;

import java.util.Scanner;

public class SecondTask {
    private static String value;

    public static void checkThree() {
        System.out.println("Enter value: ");
        Scanner in = new Scanner(System.in);
        value = in.nextLine();
        int[] valueInt = new int[value.length()];
        String[] arr = value.split("");
        for (int i = 0; i < arr.length; i++) {
            valueInt[i] = Integer.parseInt(arr[i]);
            //System.out.print(arr[i]);
            if (valueInt[i] == 3) {System.out.println("  -------- 3 is found | ");}

        }

    }
}