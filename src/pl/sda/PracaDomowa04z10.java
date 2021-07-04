package pl.sda;

import java.util.Scanner;

public class PracaDomowa04z10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszy bok trójkąta: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugi bok trójkąta: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj trzeci bok trójkąta: ");
        double c = scanner.nextDouble();

        double mp = (a+b+c) / 2;
        double x = mp * (mp -a)*(mp - b)*(mp - c);

        if (x<=0){
            System.out.println("Błędne długości boków!!!");
        }else {
            System.out.println("Pole trójkąta to: " + Math.sqrt(x));
        }
    }
}
