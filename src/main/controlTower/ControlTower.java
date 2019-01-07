/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

package main.controlTower;

import main.emergencyService.EmergencyService;
import main.interfaces.IIdentification;
import main.interfaces.ILocation;
import main.interfaces.ISubject;
import main.interfaces.Observer;
import main.ships.Ship;
import main.tools.Actor;
import main.tools.Coordinates;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public abstract class ControlTower extends Actor implements ISubject {

    protected Coordinates towerLocation;
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
    public void registerObserver(Observer newObserver) {
        listOfRegisteredShips.add((Ship) newObserver);
    }

    public void removeObserver(Observer toBeRemovedObserver) {
        int i = listOfRegisteredShips.indexOf(toBeRemovedObserver);
        if (i >= 0) {
            listOfRegisteredShips.remove(toBeRemovedObserver);
        }
    }

    public void notifyObservers() {

    }

    public double getDistance(Actor actor) {

        double distance = Point2D.distance(towerLocation.getLongitude(), towerLocation.getLatitude(), actor.getActorLocation().getLongitude(), actor.getActorLocation().getLongitude());
        return distance;
    }

    // == To-String override ==
    @Override
    public String toString() {
        return String.format("-- HARBOR --%n  -ID: %s%n  -Location: %s%n", getIdentification(), getActorLocation().toString());
    }
}
