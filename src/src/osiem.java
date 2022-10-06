package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class osiem {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj wage przesylki (kg):");
        double waga = klawiatura.nextDouble();

        System.out.println("podaj odleglosc:");
        double odleglosc = klawiatura.nextDouble();

        double kosztprzejazdu = (odleglosc% 500);




        if (waga > 5) {
            double koszt = (3.80 * kosztprzejazdu);
            BigDecimal bd = new BigDecimal(koszt).setScale(2, RoundingMode.HALF_UP);
            double koszt4 = bd.doubleValue();
            System.out.println("bedzie to kosztować:  "+koszt4+"zl");
        }
        if (waga > 3 && waga <=5) {
            double koszt1 = (3.70 * kosztprzejazdu);
            BigDecimal bd = new BigDecimal(koszt1).setScale(2, RoundingMode.HALF_UP);
            double koszt5 = bd.doubleValue();
            System.out.println("bedzie to kosztować:  "+koszt5+"zl");
        }
        if (waga > 1 && waga <= 3) {
        double koszt2 = (2.20 * kosztprzejazdu);
            BigDecimal bd = new BigDecimal(koszt2).setScale(2, RoundingMode.HALF_UP);
            double koszt6 = bd.doubleValue();
            System.out.println("bedzie to kosztować:  "+koszt6+"zl");
        }
        else {
            double koszt3 = (1.10 * kosztprzejazdu);
            BigDecimal bd = new BigDecimal(koszt3).setScale(2, RoundingMode.HALF_UP);
            double koszt7 = bd.doubleValue();
            System.out.println("bedzie to kosztować:  "+koszt7+"zl");

        }


    }
}
