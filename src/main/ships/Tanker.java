/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Tanker class that represents a ship in list main.ships
 */
package main.ships;

import main.tools.Coordinates;
import main.tools.Identification;

public class Tanker extends Ship {

    private Identification tankerID;
    private final int TANKER_SIZE = 360; //displayed in m² (square meters)


    public Tanker(Coordinates shipLocation, int shipID) {
        super(shipLocation);
        tankerID = new Identification("TNK-" + String.valueOf(shipID));
    }

    public Tanker() {
    }

    public Identification getIdentification() {
        return tankerID;
    }

    public double getSize() {
        return 0;
    }

    public int getCapacity() {
        return 0;
    }
}
