/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: SpeedBoat class that represents a ship in list main.ships
 */
package main.ships;

import main.tools.Coordinates;
import main.tools.Identification;

public class SpeedBoat extends Ship {

    private Identification speedBoatID;

    public SpeedBoat(Coordinates shipLocation, int shipID){
        super(shipLocation);
        speedBoatID = new Identification("SPB-" + String.valueOf(shipID));
    }

    public Identification getIdentification() {
        return speedBoatID;
    }

    public double getSize() {
        return 0;
    }

    public int getCapacity() {
        return 0;
    }
}
