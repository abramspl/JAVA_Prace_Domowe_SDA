package pl.sda;

import java.util.Scanner;

public class PracaDomowa05z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę z zakresu 1 - 5: ");
        int wartosc = scanner.nextInt();

        switch (wartosc){
            case 5:
                System.out.print("*");
            case 4:
                System.out.print("*");
            case 3:
                System.out.print("*");
            case 2:
                System.out.print("*");
            case 1:
                System.out.print("*");
            default:
                break;
        }
    }
}
