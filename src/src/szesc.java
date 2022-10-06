package src;

import java.util.Scanner;

public class szesc {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj ilosc sekund:");
        int sekundy = klawiatura.nextInt();




        int dni = (sekundy%86400);
        int godziny = (dni%3600);
        int minuty = (godziny%60);
        int sekundy2 = minuty;

        int dni1 = (sekundy/86400);
        int godziny1 = (dni/3600);
        int minuty1 = (godziny/60);
        int sekundy1 = minuty;


        System.out.println(sekundy+" sekund to:");
        if (dni1 != 0){
        System.out.println(dni1+"dni");}
        if (godziny1 != 0){
        System.out.println(godziny1+"godzin");        }
        if (minuty1 != 0){
        System.out.println(minuty1+"minut");}
        if (sekundy1 != 0){
        System.out.println(sekundy1+"sekund");}
    }
}
