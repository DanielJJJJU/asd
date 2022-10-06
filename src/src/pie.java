package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class pie {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj wage (kg):");
        double masa = klawiatura.nextDouble();

        double ciezar = (masa*9.8);
        BigDecimal bd = new BigDecimal(ciezar).setScale(2, RoundingMode.HALF_UP);
        double liczbaZaokroglona = bd.doubleValue();

        if(liczbaZaokroglona > 1000) {
            System.out.println("Zbyt ciezkie");
        }
        if(liczbaZaokroglona < 10) {
            System.out.println("Zbyt lekkie");
        }
        else {
            System.out.println(ciezar);
        }
    }
}
