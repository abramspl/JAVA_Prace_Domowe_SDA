package pl.sda;

import java.util.Scanner;

public class PracaDomowa04z9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą wartość 'x': ");
        int x1 = scanner.nextInt();
        System.out.print("Podaj pierwszą wartość 'y': ");
        int y1 = scanner.nextInt();
        System.out.print("Podaj drugą wartość 'x': ");
        int x2 = scanner.nextInt();
        System.out.print("Podaj drugą wartość 'y': ");
        int y2 = scanner.nextInt();
        System.out.print("Podaj wartość 'x' punktu: ");
        int px = scanner.nextInt();
        System.out.print("Podaj wartość 'y' punktu: ");
        int py = scanner.nextInt();

        if ((x1 <= px && px <= x2) && (y1 >= py && py >= y2)){
            System.out.println("inside");
        } else {
            System.out.println("outside");
        }
    }
}
