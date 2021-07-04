package pl.sda;

import java.util.Scanner;

public class PracaDomowa06z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę gwiazdek do wyświetlenia: ");
        int i = scanner.nextInt();

        while (i > 0){
            System.out.print("*");
            i = i - 1;
        }
    }
}
