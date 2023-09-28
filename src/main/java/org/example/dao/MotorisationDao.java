package org.example.dao;

import org.example.pojo.Carburant;
import org.example.pojo.Motorisation;

import java.util.List;

public interface MotorisationDao {

    List<Motorisation> getAllMotorisation();

    List<Motorisation> getAllMotorisationByCarburant(Carburant carburant);

    void saveMotorisation(Motorisation motorisation);

    void deleteMotorisationByCarburant(Carburant carburant);

}
