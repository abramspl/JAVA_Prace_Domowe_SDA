package pl.sda;

import java.util.Scanner;

public class VATApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj kwotę (liczba całkowita) a ja policzę podatek VAT: ");
        int kwota = scanner.nextInt();
        System.out.println("23% VAT z kwoty " + kwota + " to: " + ((kwota * 23) / 100) + "." + ((kwota * 23) % 100));
        System.out.print("Podaj kwotę (liczba dziesiętna) a ja policzę podatek VAT: ");
        double kwota2 = scanner.nextDouble();
        System.out.println("23% VAT z kwoty " + kwota2 + " to: " + (kwota2 * 0.23));
    }
}