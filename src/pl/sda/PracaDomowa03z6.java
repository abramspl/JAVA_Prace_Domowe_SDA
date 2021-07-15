package pl.sda;

import java.util.Scanner;

public class PracaDomowa03z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą wartość: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą wartość: ");
        int b = scanner.nextInt();

        if (a < 100){
            System.out.println("\n\t " + a + "\n+\t" + b +"\n-------\n\t" + (a+b) + "\n" );
        } else {
            System.out.println("\n\t" + a + "\n+\t" + b +"\n-------\n\t" + (a+b) + "\n" );
        }
    }
}