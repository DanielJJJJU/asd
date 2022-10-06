package src;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class siedem {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj 1 imie:");
        String imie1 = klawiatura.nextLine();

        System.out.println("podaj 2 imie:");
        String imie2 = klawiatura.nextLine();

        System.out.println("podaj 3 imie:");
        String imie3 = klawiatura.nextLine();


        List<String> patients = new LinkedList<>();
        System.out.println("imiona w kolejnosci alfabetycznej:");
        patients.add(imie1);
        patients.add(imie2);
        patients.add(imie3);
        Collections.sort(patients);
        for (String patient : patients)
        {
            System.out.println(patient);
        }

    }

}
