package src;

import java.util.Scanner;

public class trzsy {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj wage (kg):");
        double waga = klawiatura.nextDouble();

        System.out.println("podaj wzrost (m):");
        double wzrost = klawiatura.nextDouble();

        if(waga/(wzrost * wzrost) > 25) {
            System.out.println("Masz nadwage");
        }
        if(waga/(wzrost * wzrost)< 18.5) {
            System.out.println("Masz niedowage");
        }
        else{
            System.out.println("masz dopowiednia wage");
        }
    }
}
