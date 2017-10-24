/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertmoney;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ConvertMoney {

    public static double cop;
    public static double usd;
    public static double jpy;
    public static double res;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Menú\n1.Pesos a Dólares\n2.Dólares a Pesos\n"
                    + "3.Dólares a Yenes\n4.Yenes a Dólares\n5.Pesos a Yenes\n"
                    + "6.Yenes a Pesos\n7.Salir\nElegir una opción");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    copToUsd();
                    break;
                case 2:
                    usdToCop();
                    break;
                case 3:
                    usdToJpy();
                    break;
                case 4:
                    jpyToUsd();
                    break;
                case 5:
                    copToJpy();
                    break;
                case 6:
                    jpyToCop();
                    break;
                default:
                    System.out.println("Opcion no valida, ingresa de nuevo");
            }
        } while (op != 7);
    }

    public static void copToUsd() {
        usd = 0.0003390;
        System.out.print("Ingresa el valor en Pesos:");
        cop = scan.nextDouble();
        res = cop * usd;
        System.out.println("Pesos colombianos en dólares: " + res);
    }

    public static void usdToCop() {
        cop = 2950.0;
        System.out.print("Ingresa el valor en Dolares:");
        usd = scan.nextDouble();
        res = usd * cop;
        System.out.println("Dólares en pesos colombianos: " + res);
    }

    public static void usdToJpy() {
        jpy = 113.38;
        System.out.print("Ingresa el valor en Dólares:");
        usd = scan.nextDouble();
        res = usd * jpy;
        System.out.println("Dólares en yenes: " + res);
    }

    public static void jpyToUsd() {
        usd = 0.008820;
        System.out.print("Ingresa el valor en Yenes:");
        jpy = scan.nextDouble();
        res = jpy * usd;
        System.out.println("Yenes en dolares: " + res);
    }

    public static void copToJpy() {
        jpy = 0.3842;
        System.out.print("Ingresa el valor en Pesos:");
        cop = scan.nextDouble();
        res = cop * jpy;
        System.out.println("Pesos colombianos en yenes: " + res);
    }

    public static void jpyToCop() {
        cop = 26.0252;
        System.out.print("Ingresa el valor en Yenes:");
        jpy = scan.nextDouble();
        res = jpy * cop;
        System.out.println("Yenes en pesos colombianos: " + res);
    }

}
