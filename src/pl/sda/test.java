package pl.sda;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int end = 3;

        do {
            while (end > 0) {
                System.out.print("*");
                end--;
            }
            counter++;
            end = 3;
            System.out.println();
        } while (counter < end);
    }
}
