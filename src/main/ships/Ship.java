/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package main.ships;

import main.interfaces.IObserver;
import main.tools.Actor;
import main.tools.Coordinates;

import java.awt.geom.Point2D;

public abstract class Ship extends Actor implements IObserver {

    protected Coordinates shiplocation;

    public Ship(Coordinates shiplocation) {
        super(shiplocation);
    }

    // == Update the subject on status change==
    public void update(){}

    // == To-String override ==
    @Override
    public String toString() {
        return String.format("-- SHIP --%n  -ID: %s%n  -Location: %s%n", getIdentification(), getActorLocation().toString());
    }




}
