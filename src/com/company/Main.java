package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main objektas = new Main();

        objektas.ivedimas();
        objektas.isvedimas();
    }

    private int[] masyvas;
    private int suma;

    public void ivedimas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius");
        masyvas = new int[5];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite skaiciu "+(i+1));
            masyvas[i] = sc.nextInt();
            suma += masyvas[i];


        }

    }

    public void isvedimas() {
        System.out.println("=================");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i]);

        }
        System.out.println("Suma: " + suma);
    }
}