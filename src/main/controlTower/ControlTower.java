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

import java.awt.geom.Point2D;
import java.util.ArrayList;

public abstract class ControlTower extends Actor implements ISubject {

    public ArrayList<Ship> listOfRegisteredShips;
    public ArrayList<EmergencyService> listOfEmergencyServices;

    // == Constructors ==
    public ControlTower(Coordinates towerLocation) {
        super(towerLocation);
    }

    // == Methods for this actor ==
    public int getCapacity() {
        return 0;
    }

    public double getSize() {
        return 0;
    }

    // == Dealing with ships as observers ==
    public void registerObserver(IObserver newObserver) {
        listOfRegisteredShips.add((Ship) newObserver);
    }

    public void removeObserver(IObserver toBeRemovedObserver) {
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
