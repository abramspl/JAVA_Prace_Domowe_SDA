package pl.sda;

import java.util.Scanner;

public class PracaDomowa04z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę od 1 do 9: ");
        int war = scanner.nextInt();

        if (war > 9){
            System.out.println("Nieprawidłowa liczba!!!");
        } else {
            if (war == 1){
                System.out.println("JEDEN");
            }
            if (war == 2){
                System.out.println("DWA");
            }
            if (war == 3){
                System.out.println("TRZY");
            }
            if (war == 4){
                System.out.println("CZTERY");
            }
            if (war == 5){
                System.out.println("PIĘĆ");
            }
            if (war == 6){
                System.out.println("SZEŚĆ");
            }
            if (war == 7){
                System.out.println("SIEDEM");
            }
            if (war == 8){
                System.out.println("OSIEM");
            }
            if (war == 9){
                System.out.println("DZIEWIĘĆ");
            }
        }
    }
}
