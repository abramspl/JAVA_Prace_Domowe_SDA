package pl.sda.aplikacja;

import java.util.Scanner;

public class OperacjeBankowe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user;
        User user1 = new User("Lukasz", 1234, 2000);
        User user2 = new User("Ania",4789,1800);

        System.out.println("Witaj w naszym Banku");
        System.out.print("Wybierz:\n\t1 - karta Lukasz\n\t2 - karta Ania\n\tOpcja: ");

        int opcja = scanner.nextInt();
        if (opcja==1){
            user=user1;
        }else {
            user=user2;
        }
        System.out.print("Wprowadź PIN ");
        user.WprowadzPin();
        user.Opcje();
    }
}