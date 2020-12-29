package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first coordinates");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter second coordinates");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println("Enter third coordinates");
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) System.out.println("Точки лежат на прямой");
        else System.out.println("Точки не лежат на прямой");
    }
}
