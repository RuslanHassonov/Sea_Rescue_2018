/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Ferry class that represents a ship in list ships
 */
package ships;

import tools.Coordinates;
import tools.Identification;

public class Ferry extends Ship {

    private Identification ferryID;

    public Ferry(Coordinates shipLocation, int shipID) {
        super(shipLocation);
        ferryID = new Identification("FRY-" + String.valueOf(shipID));
    }

    @Override
    public Identification getIdentification() {
        return ferryID;
    }

    @Override
    public double getSize() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
