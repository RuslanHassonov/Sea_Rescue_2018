/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package controlTower;

import tools.Coordinates;
import tools.Identification;

public class Harbor extends ControlTower {

    private Identification towerID;
    //private final int TANKER_SIZE = 360; //displayed in m² (square meters)

    public Harbor(Coordinates towerLocation, int towerID){
        super(towerLocation);
        this.towerID = new Identification("HRB-" + String.valueOf(towerID));
    }

    @Override
    public Identification getIdentification() {
        return towerID;
    }

}
