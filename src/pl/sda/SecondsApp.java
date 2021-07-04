package pl.sda;

import java.util.Scanner;

public class SecondsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj godzinę i minuty a ja oblicze ile to sekund");
        System.out.print("Podaj liczbę godzin: ");
        int godzina = scanner.nextInt();
        System.out.print("Podaj liczbę minut: ");
        int minuta = scanner.nextInt();
        System.out.print("Wynik to: " + ((3600 * godzina) + (60 * minuta) + " sekund"));
    }
}
