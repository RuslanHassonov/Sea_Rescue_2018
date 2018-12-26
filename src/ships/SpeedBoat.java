/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: SpeedBoat class that represents a ship in list ships
 */
package ships;

import tools.Coordinates;
import tools.Identification;

public class SpeedBoat extends Ship {

    private Identification speedBoatID;

    public SpeedBoat(Coordinates shipLocation, int shipID){
        super(shipLocation);
        speedBoatID = new Identification("SPB-" + String.valueOf(shipID));
    }

    @Override
    public Identification getIdentification() {
        return speedBoatID;
    }
}
