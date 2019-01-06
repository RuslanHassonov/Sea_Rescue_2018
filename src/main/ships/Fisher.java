/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Fisher class that represents a ship in list main.ships
 */
package main.ships;

import main.tools.Coordinates;
import main.tools.Identification;

public class Fisher extends Ship {

    private Identification fisherID;
    public Fisher(Coordinates shipLocation, int shipID){
        super(shipLocation);
        fisherID = new Identification("FSH-" + String.valueOf(shipID));
    }

    public Identification getIdentification() {
        return fisherID;
    }

    public double getSize() {
        return 0;
    }

    public int getCapacity() {
        return 0;
    }
}
