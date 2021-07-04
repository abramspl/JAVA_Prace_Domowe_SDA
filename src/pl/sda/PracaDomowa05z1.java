package pl.sda;

import java.util.Scanner;

public class PracaDomowa05z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą od 1 do 7: ");
        int wartosc = scanner.nextInt();

        switch (wartosc){
            case 1:
                System.out.println("PONIEDZIAŁEK");
                break;
            case 2:
                System.out.println("WTOREK");
                break;
            case 3:
                System.out.println("ŚRODA");
                break;
            case 4:
                System.out.println("CZWARTEK");
                break;
            case 5:
                System.out.println("PIĄTEK");
                break;
            case 6:
                System.out.println("SOBOTA");
                break;
            case 7:
                System.out.println("NIEDZIELA");
                break;
            default:
                System.out.println("Niepoprawna wartość!!!");
        }
    }
}
