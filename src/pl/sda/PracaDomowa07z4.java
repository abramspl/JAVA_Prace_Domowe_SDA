package pl.sda;

import java.util.Scanner;

public class PracaDomowa07z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int wartosc = scanner.nextInt();

        for (int i = 0; i <= wartosc; i++) {
            for (int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
