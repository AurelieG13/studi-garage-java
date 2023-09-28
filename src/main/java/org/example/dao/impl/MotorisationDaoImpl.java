package org.example.dao.impl;

import org.example.dao.MotorisationDao;
import org.example.pojo.Carburant;
import org.example.pojo.Motorisation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MotorisationDaoImpl  implements MotorisationDao {
    private List<Motorisation> motorisations;

    public MotorisationDaoImpl() {
        motorisations = new ArrayList<>();
    }

    @Override
    public List<Motorisation> getAllMotorisation() {
        return motorisations;
    }

    @Override
    public List<Motorisation> getAllMotorisationByCarburant(Carburant carburant) {
        return motorisations.stream()
                .filter(motorisation -> motorisation.getTypeCarburant()
                        .equals(carburant))
                .collect(Collectors.toList());
    }

    @Override
    public void saveMotorisation(Motorisation motorisation) {
        motorisations.add(motorisation);
    }

    @Override
    public void deleteMotorisationByCarburant(Carburant carburant) {
        motorisations.removeIf(motorisation -> motorisation.getTypeCarburant()
                .equals(carburant));
    }
}
