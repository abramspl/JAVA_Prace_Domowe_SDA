package pl.sda;

import java.util.Scanner;

public class PracaDomowa05z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę miesiąca np. LUTY, LIPIEC, a ja wyświetlę jego liczbę dni: ");
        switch (scanner.next()){
            default:
                System.out.println("Nie ma takiego miesiąca!!!");
                break;
            case "STYCZEŃ":
                System.out.println("STYCZEŃ posiada " + 31 + " dni.");
                break;
            case "LUTY":
                System.out.println("LUTY posiada " + 28 + " lub " + 29 + " dni.");
                break;
            case "MARZEC":
                System.out.println("MARZEC posiada " + 31 + " dni.");
                break;
            case "KWIECIEŃ":
                System.out.println("KWIECIEŃ posiada " + 30 + " dni.");
                break;
            case "MAJ":
                System.out.println("MAJ posiada " + 31 + " dni.");
                break;
            case "CZERWIEC":
                System.out.println("CZERWIEC posiada " + 30 + " dni.");
                break;
            case "LIPIEC":
                System.out.println("LIPIEC posiada " + 31 + " dni.");
                break;
            case "SIERPIEŃ":
                System.out.println("SIERPIEŃ posiada " + 31 + " dni.");
                break;
            case "WRZESIEŃ":
                System.out.println("WRZESIEŃ posiada " + 30 + " dni.");
                break;
            case "PAŹDZIERNIK":
                System.out.println("PAŹDZIERNIK posiada " + 31 + " dni.");
                break;
            case "LISTOPAD":
                System.out.println("LISTOPAD posiada " + 30 + " dni.");
                break;
            case "GRUDZIEŃ":
                System.out.println("GRUDZIEŃ posiada " + 31 + " dni.");
                break;
        }
    }
}
