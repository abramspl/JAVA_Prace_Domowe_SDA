package pl.sda;

import java.util.Scanner;

public class PracaDomowa04z5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj aktualną temperaturę: ");
        double temperatura = scanner.nextDouble();

        if (temperatura >= 28) {
            System.out.println("Ale upał!!!");
        } else {
            if (temperatura >= 0 && temperatura <= 10) {
                System.out.println("Ale zimno!!!");
            }
            if (temperatura > 10 && temperatura <= 18){
                System.out.println("Ale chłodno!!!");
            }
            if (temperatura > 18 && temperatura <= 22){
                System.out.println("Ale ciepło!!!");
            }
            if (temperatura >22 && temperatura <= 27){
                System.out.println("Jest bardzo ciepło!!!");
            }
        }
    }
}
