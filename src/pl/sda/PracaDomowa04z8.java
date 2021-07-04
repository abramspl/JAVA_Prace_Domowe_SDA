package pl.sda;

import java.util.Scanner;

public class PracaDomowa04z8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę litrów wody: ");
        int woda = scanner.nextInt();

        System.out.println("5 l: " + woda / 5);
        woda = woda % 5;
        System.out.println("3 l: " + woda / 3);
        woda = woda % 3;
        System.out.println("1 l: " + woda / 1);
    }
}
