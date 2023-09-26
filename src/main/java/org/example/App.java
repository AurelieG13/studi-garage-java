package org.example;

import org.example.pojo.Garage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Garage garage = new Garage("Chez Michel", "ventabren", 12);
        System.out.println(garage.getNom());
    }
}
