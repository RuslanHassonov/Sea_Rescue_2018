/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
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

public abstract class Ship extends Actor implements Observer, IMeasurement {

    protected Coordinates shiplocation;

    public Ship(Coordinates shiplocation) {
        super(shiplocation);
    }

    /*private double length;
    private double width;
    int capacity;

    public Ship (double length, double width)throws IllegalArgumentException {
        if(length<0 || length==0) throw new IllegalArgumentException("Invalid number");
        this.length = length;

        if (width<0 || width==0) throw new IllegalArgumentException("Invalid number");
        this.width = width;
}
    // Get size and capacity

    public double getSize() {return calculatedSize();}

    public double calculatedSize(){
        return length*width;
    }

    public int getCapacity() {
        return capacity;
    }
*/

    public double getDistance(Actor actor){

        double distance = Point2D.distance(shiplocation.getLongitude(), shiplocation.getLatitude(), actor.getActorLocation().getLongitude(),actor.getActorLocation().getLongitude());
        return distance; }



    // == Update the subject on status change==
    public void update(){}

    // == To-String override ==
    @Override
    public String toString() {
        return String.format("-- SHIP --%n  -ID: %s%n  -Location: %s%n", getIdentification(), getActorLocation().toString());
    }




}
