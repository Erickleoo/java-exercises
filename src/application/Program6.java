package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();

        System.out.println();
        System.out.println("How many dollars will be bought?");
        double dollarsBought = sc.nextDouble();

        System.out.println();
        System.out.printf("Amount to be pain in reais = %.2f", CurrencyConverter.calculateTotalInReais(dollarPrice, dollarsBought));

        sc.close();
    }
}
