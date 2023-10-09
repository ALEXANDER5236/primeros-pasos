package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int resultado,tabla,m;

        System.out.println("que número desea ");


          Scanner input = new Scanner(System.in);
          tabla=input.nextInt();

        for (m = 1; m <= 12; m++) {
            resultado=tabla*m;

            System.out.println(tabla + "x" + m + "=" + resultado);
        }
    }
}