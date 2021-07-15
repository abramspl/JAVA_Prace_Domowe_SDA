package pl.sda.aplikacja;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Lukasz",1234,2000);

        System.out.print("Witaj w naszym Banku\nPodaj swoj PIN: ");
        int pin = scanner.nextInt();
        System.out.println();

        if (pin != user1.pin){
            System.out.println("To nie jest prawidłowy PIN!!!");
            System.out.println("Spróbuj ponownie");
        }else {
            System.out.println("Witaj " + user1.imie.toUpperCase() + " - Twój PIN jest poprawny");
            System.out.println("Wybierz opcję 1,2 lub 3:");
            System.out.println("1 - wpłacić pieniądze?\n2 - wypłacić pieniądze?\n3 - zakończyć operację");
            System.out.print("Opcja nr: ");
            int opcja = scanner.nextInt();
            switch (opcja){
                case 1:
                    System.out.print("Wpisz kwotę którą chcesz wpłacić: ");
                    int kwota = scanner.nextInt();
                    user1.Wyplata(kwota);
                    break;
                case 2:
                    System.out.print("Wpisz kwotę którą chcesz wypłacić: ");
                    int kwota2 = scanner.nextInt();
                    user1.Wyplata(kwota2);
                    break;
                case 3:
                    System.out.println("Do zobaczenia następnym razem");
                    break;
            }
        }
    }
}
