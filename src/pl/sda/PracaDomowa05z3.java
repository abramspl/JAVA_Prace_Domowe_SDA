package pl.sda;

import java.util.Scanner;

public class PracaDomowa05z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę w zapisie rzymskim (`I`, `V`, `X`, `M`, `C`): ");
        switch (scanner.next()){
            default:
                System.out.println("Niepoprawna wartość!!!");
                break;
            case "I":
                System.out.println("Jest to liczba: " + 1);
                break;
            case "V":
                System.out.println("Jest to liczba: " + 5);
                break;
            case "X":
                System.out.println("Jest to liczba: " + 10);
                break;
            case "M":
                System.out.println("Jest to liczba: " + 1000);
                break;
            case "C":
                System.out.println("Jest to liczba: " + 100);
                break;
        }
    }
}
