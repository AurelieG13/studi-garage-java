package org.example;

import org.example.pojo.Garage;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Garage monGarage = createGarage();
        System.out.println(monGarage);
    }

    public static Garage createGarage() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom d'un garage :");
        String nomGarage = sc.nextLine();
        System.out.println("Veuillez entrer l'adresse du garage :");
        String adresseGarage = sc.nextLine();
        System.out.println("Veuillez entrer le nombre de place dans votre garage :");
        int placeGarage = sc.nextInt();

        return new Garage(nomGarage, adresseGarage, placeGarage);
    }
}
