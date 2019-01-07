/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package main.controlTower;

import main.tools.Coordinates;
import main.tools.Identification;

public class Harbor extends ControlTower {

    private Identification towerID;
    //private final int TANKER_SIZE = 360; //displayed in m² (square meters)

    public Harbor(Coordinates towerLocation, int towerID){
        super(towerLocation);
        this.towerID = new Identification("HRB-" + String.valueOf(towerID));
    }

    public Identification getIdentification() {
        return towerID;
    }

}
