/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

package main.tools;

import main.interfaces.IIdentification;
import main.interfaces.ILocation;
import main.interfaces.IMeasurement;
import main.interfaces.INavigation;

public abstract class Actor implements ILocation, IIdentification, IMeasurement{

    private Coordinates actorLocation;

    public Actor(Coordinates actorLocation) {
        this.actorLocation = actorLocation;
    }

    public Coordinates getActorLocation(){
        return actorLocation;
    }

    public abstract double getDistance(Actor actor);
}
