/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Fisher class that represents a ship in list ships
 */
package ships;

import tools.Coordinates;
import tools.Identification;

public class Fisher extends Ship {

    private Identification fisherID;
    public Fisher(Coordinates shipLocation, int shipID){
        super(shipLocation);
        fisherID = new Identification("FSH-" + String.valueOf(shipID));
    }

    @Override
    public Identification getIdentification() {
        return fisherID;
    }
}
