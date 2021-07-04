package pl.sda;

import java.util.Scanner;

public class ParkingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj czas parkowania a ja obliczę kwotę do zapłaty");
        System.out.print("Liczba godzin: ");
        int godzina = scanner.nextInt();
        System.out.print("Liczba minut: ");
        int minuta = scanner.nextInt();
        double czas = godzina + (minuta * 0.01);

        if (czas >= 1.30){
            int wynik1 = 2 + ((godzina - 1) * 3);
            if (minuta >= 30){
                int wynik2 = 3;
                System.out.println("Koszt parkowania to: "+ (wynik1 + wynik2) + "zł");
            } else {
                int wynik2 = 0;
                System.out.println("Koszt parkowania to: "+ (wynik1 + wynik2) + "zł");
            }
        } else {
            System.out.println("Koszt parkowania to: " + 2 + "zł");
        }
    }
}
