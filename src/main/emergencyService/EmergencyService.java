/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package main.emergencyService;

import main.interfaces.IIdentification;
import main.interfaces.ILocation;
import main.interfaces.IMeasurement;
import main.tools.Actor;
import main.tools.Coordinates;

import java.awt.geom.Point2D;

public abstract class EmergencyService extends Actor {

    protected Coordinates rescueLocation;

    public EmergencyService(Coordinates rescueLocation) {
        super(rescueLocation);
    }

    public double getDistance(Actor actor){

        double distance = Point2D.distance(rescueLocation.getLongitude(), rescueLocation.getLatitude(), actor.getActorLocation().getLongitude(),actor.getActorLocation().getLongitude());
        return distance;
    }

    @Override
    public String toString() {
        return String.format("-- SOS SERVICE --%n  -ID: %s%n  -Location: %s%n", getIdentification(), getActorLocation().toString());
    }
}
