/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Ferry class that represents a ship in list main.ships
 */
package main.ships;

import main.tools.Coordinates;
import main.tools.Identification;

public class Ferry extends Ship {

    private Identification ferryID;

    public Ferry(Coordinates shipLocation, int shipID) {
        super(shipLocation);
        ferryID = new Identification("FRY-" + String.valueOf(shipID));
    }

    public Identification getIdentification() {
        return ferryID;
    }

    public double getSize() {
        return 0;
    }

    public double getCapacity() {
        return 0;
    }
}
