package pl.sda;

import java.util.Scanner;

public class PracaDomowa04z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        int minValue = Math.min(a,b);
        int minValue2 = Math.min(minValue,c);
        System.out.println("Oto najmniejsza liczna z podanych trzech: " + minValue2);
    }
}
