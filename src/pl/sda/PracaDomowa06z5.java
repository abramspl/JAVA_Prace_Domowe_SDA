package pl.sda;

import java.util.Scanner;

public class PracaDomowa06z5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Wpisz liczbę od 1 do 10: ");
            int x = scanner.nextInt();
            if (x > 10 || x <= 0 ){
                break;
            }else {
                if (x == 1){
                    System.out.println("I");
                }
                if (x == 2){
                    System.out.println("II");
                }
                if (x == 3){
                    System.out.println("III");
                }
                if (x == 4){
                    System.out.println("IV");
                }
                if (x == 5){
                    System.out.println("V");
                }
                if (x == 6){
                    System.out.println("VI");
                }
                if (x == 7){
                    System.out.println("VII");
                }
                if (x == 8){
                    System.out.println("VIII");
                }
                if (x == 9){
                    System.out.println("IX");
                }
                if (x == 10){
                    System.out.println("X");
                }
            }
        }
    }
}
