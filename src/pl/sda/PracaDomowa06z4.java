package pl.sda;

import java.util.Scanner;

public class PracaDomowa06z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość boku kwadratu: ");
        int bok = scanner.nextInt();
        int bok2 = bok;
        int licznik = 0;

        do{
            while ( bok > 0){
                System.out.print("*");
                bok--;
            }
            licznik++;
            bok = bok2;
            System.out.println();
        } while (licznik < bok);
    }
}