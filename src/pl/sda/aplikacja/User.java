package pl.sda.aplikacja;

import java.util.Scanner;

public class User {

    public String imie;
    public int pin;
    public int stanKonta;

    User(String imie, int pin, int stanKonta) {
        this.imie = imie;
        this.pin = pin;
        this.stanKonta = stanKonta;
    }

    public void Wplata(int kwota) {
        stanKonta += kwota;
        System.out.println("Na twoje konto wpłacono " + kwota + "zł");
        System.out.println("Aktualny stan konta to: " + stanKonta + "zł");
    }

    public void Wyplata(int kwota) {
        if (kwota > stanKonta) {
            System.out.println("Chcesz pobrać " + kwota);
            System.out.println("Brak tylu środków na koncie!\nTwój aktualny stan konta to: " + stanKonta);
        } else {
            stanKonta -= kwota;
            System.out.println("Z twojego konta pobrano " + kwota + "zł");
            System.out.println("Aktualny stan konta to: " + stanKonta + "zł");
        }
    }

    public void WprowadzPin() {
        do {
            Scanner scanner = new Scanner(System.in);
            int p = scanner.nextInt();
            if (p != pin) {
                System.out.println("Nieprawidłowy PIN!!!");
                System.out.print("Podaj prawidłowy PIN: ");
            } else {
                break;
            }
        } while (pin == pin);
    }

    public void Opcje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWitaj " + imie.toUpperCase() + " - Twój PIN jest poprawny");
        System.out.println("Wybierz opcję 1,2 lub 3:");
        System.out.println("1 - wpłacić pieniądze?\n2 - wypłacić pieniądze?\n3 - zakończyć operację");
        System.out.print("Opcja nr: ");
        int opcja = scanner.nextInt();
        System.out.println();
        switch (opcja) {
            case 1:
                System.out.print("Wpisz kwotę którą chcesz wpłacić: ");
                int kwota = scanner.nextInt();
                Wplata(kwota);
                System.out.println();
                break;
            case 2:
                System.out.print("Wpisz kwotę którą chcesz wypłacić: ");
                int kwota2 = scanner.nextInt();
                Wyplata(kwota2);
                System.out.println();
                break;
            case 3:
                break;
        }
        System.out.println("Dziękujemy za skorzystanie z usług naszego Banku");
        System.out.println("Zapraszamy ponownie");
    }
}