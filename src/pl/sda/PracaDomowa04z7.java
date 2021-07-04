package pl.sda;

import java.util.Scanner;

public class PracaDomowa04z7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę od 1 do 9: ");
        int war = scanner.nextInt();

        if (war > 9) {
            System.out.println("Nieprawidłowa liczba!!!");
        } else {
            if (war == 1) {
                System.out.println(war + " program");
            }
            if (war > 1 && war < 5) {
                System.out.println(war + " programy");
            }
            if (war > 4 && war <= 9) {
                System.out.println(war + " programów");
            }
        }
    }
}
