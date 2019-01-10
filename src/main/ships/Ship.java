/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package main.ships;

import main.interfaces.IObserver;
import main.tools.Actor;
import main.tools.Coordinates;

public abstract class Ship extends Actor implements IObserver{

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
    // == Update the subject on status change==
    public void update(){}

    // == To-String override ==
    @Override
    public String toString() {
        return String.format("-- SHIP --%n  -ID: %s%n  -Location: %s%n", getIdentification(), getActorLocation().toString());
    }




}
