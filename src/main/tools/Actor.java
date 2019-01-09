/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

package main.tools;

import main.interfaces.IIdentification;
import main.interfaces.ILocation;
import main.interfaces.IMeasurement;

import java.awt.geom.Point2D;
import java.text.DecimalFormat;

public abstract class Actor implements ILocation, IIdentification, IMeasurement{

    private Coordinates actorLocation;

    public Actor(Coordinates actorLocation) {
        this.actorLocation = actorLocation;
    }

    public Coordinates getActorLocation(){
        return actorLocation;
    }

<<<<<<< HEAD
    public double getDistance(Actor actor){
        double distance = Point2D.distance(actorLocation.getLongitude(), actorLocation.getLatitude(), actor.getActorLocation().getLongitude(),actor.getActorLocation().getLongitude());
        return (double) Math.round(distance * 100) / 100;
    }
=======
    public abstract double getDistance(Actor actor);

>>>>>>> origin/master
}
