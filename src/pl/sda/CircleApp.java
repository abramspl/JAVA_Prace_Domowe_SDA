package pl.sda;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promień koła: ");
        double promien = scanner.nextDouble();
        System.out.println("Pole koła wynosi: " + 3.14 * (promien * promien));
        System.out.println("Obwód koła wynosi: " + 3.14 * (promien * 2));
    }
}
