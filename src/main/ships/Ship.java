/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package main.ships;

import main.interfaces.IIdentification;
import main.interfaces.ILocation;
import main.interfaces.IMeasurement;
import main.interfaces.Observer;
import main.tools.Actor;
import main.tools.Coordinates;

import java.awt.geom.Point2D;

public abstract class Ship extends Actor implements Observer {

    protected Coordinates shiplocation;

    public Ship(Coordinates shiplocation) {
        super(shiplocation);
    }

    public double getDistance(Actor actor){

        double distance = Point2D.distance(shiplocation.getLongitude(), shiplocation.getLatitude(), actor.getActorLocation().getLongitude(),actor.getActorLocation().getLongitude());
        return distance;
    }

    // == Update the subject on status change==
    public void update(){}

    // == To-String override ==
    @Override
    public String toString() {
        return String.format("-- SHIP --%n  -ID: %s%n  -Location: %s%n", getIdentification(), getActorLocation().toString());
    }




}
