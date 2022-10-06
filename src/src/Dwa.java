package src;

import java.util.Scanner;

public class Dwa {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj dzien (w formie liczby):");
        int dzien = klawiatura.nextInt();

        System.out.println("podaj miesiac (w formie liczby):");
        int miesiac = klawiatura.nextInt();

        System.out.println("podaj 2 ostatnie cyfry roku:");
        int rok= klawiatura.nextInt();

        if(dzien * miesiac == rok) {
            System.out.println("to jest magiczna data");
        }
        else{
            System.out.println("to nie jest magiczna data");
        }

    }
}
