package com.company;

import java.util.Scanner;

public class FirstTask{
    static int a,b,c;
    static int x,y;
    int count = 0;

    static void brick(){
        Scanner in = new Scanner(System.in);
        boolean sideHigherZero = true;
        while (sideHigherZero == true) {
            System.out.println("Enter a: ");
            a = in.nextInt();
            System.out.println("Enter b: ");
            b = in.nextInt();
            System.out.println("Enter c: ");
            c = in.nextInt();
            System.out.println("Enter x: ");
            x = in.nextInt();
            System.out.println("Enter y: ");
            y = in.nextInt();
            break;
        }
        int countSide = 0;
        if (a<x || a<y ) {
            countSide +=1;
        }
        if (b<x || b<y ) {
            countSide +=1;
        }
        if (c<x || c<y ) {
            countSide +=1;
        }
        if (countSide >=2){
            System.out.println("Positive");
        } else System.out.println("Negative");
    }

}