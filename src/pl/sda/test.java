package pl.sda;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int num = 5;

        for (int i = 0; i < num; i++) { //tutaj deklaruję ile razy chcę mieć linii kodu np. num = 5
            for (int k = i; k < num - 1; k++) { //tutaj deklaruję ile chcę mieć " " Muszę to uzależnić od linii w której to jest napisane, dlatego k = i
                //oraz nie potrzebuję 5-ciu " " tylko 4, dlatego jest num - 1
                System.out.print(" "); //nie jest printLN żeby nie było przepisania do dolnej linijki, chcę by pisał w jednej linii
            }
            for (int k = 1; k <= i+1; k++) { // tutaj deklaruję ile chce mieć napisanych "#". Potrzebuję zacząć od 1 w pierwszej linii, dlatego jest k <= i+1
                // i dodawać kolejne # wraz ze wzrostem "i"
                System.out.print("#");
            }
            System.out.println(); // po zakończeniu linii kodu o numerze "i" potrzebuję przejść do nowej linijki
        }
    }
}
