/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

package main.controlTower;

import main.emergencyService.EmergencyService;
import main.interfaces.ISubject;
import main.interfaces.IObserver;
import main.ships.Ship;
import main.tools.Actor;
import main.tools.Coordinates;
import main.tools.Identification;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class ControlTower extends Actor implements ISubject {

    private Identification towerID;

    public ArrayList<Ship> listOfRegisteredShips;
    public ArrayList<EmergencyService> listOfEmergencyServices;

    // == Constructors ==
    public ControlTower(Coordinates towerLocation, int towerID) {
        super(towerLocation);
        this.towerID = new Identification("TWR-" + String.valueOf(towerID));
        listOfRegisteredShips = new ArrayList<Ship>();
        listOfEmergencyServices = new ArrayList<EmergencyService>();
    }

    public ControlTower() {
    }

    // == Methods for this actor ==
    public Identification getIdentification() {
        return towerID;
    }

    // == Dealing with ships as observers ==
    public void registerObserver(Ship newObserver) {
        listOfRegisteredShips.add(newObserver);
    }

    public void removeObserver(Ship toBeRemovedObserver) {
        int i = listOfRegisteredShips.indexOf(toBeRemovedObserver);
        if (i >= 0) {
            listOfRegisteredShips.remove(toBeRemovedObserver);
        }
    }

    public void notifyObservers() {

    }

    // == To-String override ==
    @Override
    public String toString() {
        return String.format("-- HARBOR --%n  -ID: %s%n  -Location: %s%n", getIdentification(), getActorLocation().toString());
    }
}
