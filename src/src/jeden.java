package src;

import java.util.Scanner;

public class jeden {
    public static void main(String[] args) {

    Scanner klawiatura = new Scanner(System.in);

    System.out.println("podaj liczbe z przedzialu od 1-10: ");

    int rzymska = klawiatura.nextInt();


    switch (rzymska) {
            case 1:
                System.out.println("Odpowiedz to: I");
                break;
            case 2:
                System.out.println("Odpowiedz to: II");
                break;
            case 3:
                System.out.println("Odpowiedz to: III");
                break;
            case 4:
                System.out.println("Odpowiedz to: IV");
                break;
            case 5:
                System.out.println("Odpowiedz to: v");
                break;
            case 6:
                System.out.println("Odpowiedz to: vI");
                break;
            case 7:
                System.out.println("Odpowiedz to: VII");
                break;
            case 8:
                System.out.println("Odpowiedz to: VIII");
                break;
            case 9:
                System.out.println("Odpowiedz to: IX");
                break;
            case 10:
                System.out.println("Odpowiedz to: X");
                break;
            default:
                System.out.println("bląd 404");

        }
    }
}
