package pl.sda;

import java.util.Scanner;

public class AgeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę rzeczywistą: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę rzeczywistą: ");
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println("Wynik: " + a / b);
        } else {
            System.out.println("Wynik: " + b / a);
        }
    }
}
