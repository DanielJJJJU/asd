package src;

import java.util.Scanner;

public class cztery {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj wynik testu pierwszego:");
        double wynik1 = klawiatura.nextDouble();

        System.out.println("podaj wynik testu drugiego:");
        double wynik2 = klawiatura.nextDouble();

        System.out.println("podaj wynik testu trzeciego:");
        double wynik3 = klawiatura.nextDouble();

        double srednia = (wynik1+wynik3+wynik2)/3;




            if  (srednia >= 90) {
                System.out.println("srednia:" + " " + srednia + "\nocena:" + " " + "5");
            }
            if (srednia >= 80) {
                System.out.println("srednia:" + " " + srednia + "\nocena:" + " " + "4");
            }
            if (srednia >= 70) {
                System.out.println("srednia:" + " " + srednia + "\nocena:" + " " + "3");
            }
            if (srednia >= 60) {
                System.out.println("srednia:" + " " + srednia + "\nocena:" + " " + "2");
            }
            else
                System.out.println("srednia:" + " " + srednia + "\nocena:" + " " + "1");
        }

        }


