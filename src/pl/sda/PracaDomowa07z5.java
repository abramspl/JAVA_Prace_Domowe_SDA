package pl.sda;

import java.util.Scanner;

public class PracaDomowa07z5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj liczbę: ");
//        int wartosc = scanner.nextInt();

        int wartosc = 4;

        for (int i = wartosc; i > 0; i--) {
            for (int j = 0; j < i; j++){
                System.out.print("#");
            }
            for (int k = 0; k < i; k++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
