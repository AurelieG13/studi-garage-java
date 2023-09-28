package org.example;

import org.example.dao.MotorisationDao;
import org.example.dao.impl.MotorisationDaoImpl;
import org.example.exceptions.InvalidPlaceGarageException;
import org.example.pojo.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvalidPlaceGarageException {

        try{
            Garage monGarage = createGarage();
        }catch(InvalidPlaceGarageException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        //Garage monHangar = new Hangar("totohangar", "bla", 3);
        //System.out.println(monHangar);
        //System.out.println(monGarage);

        //Garage unGarage = new Hangar("toto", "tata", 4);
        //System.out.println(unGarage);

        //Marque marque = new Marque("test");

        /*
        MotorisationDao motorisationDao = new MotorisationDaoImpl();

        // création d'un moteur
        motorisationDao.saveMotorisation(new Motorisation(Carburant.DIESEL, 150));
        motorisationDao.saveMotorisation(new Motorisation(Carburant.ESSENCE, 130));

        // récupération des moteurs
        System.out.println(motorisationDao.getAllMotorisation());

        //suppression des moteurs diesel
        motorisationDao.deleteMotorisationByCarburant(Carburant.DIESEL);

        // récupération des moteurs
        System.out.println(motorisationDao.getAllMotorisation());
        */
    }

    public static Garage createGarage() throws InvalidPlaceGarageException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom d'un garage :");
        String nomGarage = sc.nextLine();
        System.out.println("Veuillez entrer l'adresse du garage :");
        String adresseGarage = sc.nextLine();
        int placeGarage = 0;
        boolean verif = false;

        while(!verif) {
            try {
                System.out.println("Veuillez entrer le nombre de place dans votre garage :");
                placeGarage = sc.nextInt();

                if(placeGarage <= 0) {
                    throw new InvalidPlaceGarageException("Vous avez entré un nombre de place inférieur à 0");
                }
                verif = true;
            } catch (InputMismatchException e) {
                System.out.println("Ceci n'est pas un nombre, rééssayez !");
                sc.next(); // nettoyer le cache de la saisie clavier !! c'est différent de reset qui va arreter les ressources
            }
        }
        return new Garage(nomGarage, adresseGarage, placeGarage);
    }
}
