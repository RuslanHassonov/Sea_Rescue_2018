package tools;

import controlTower.ControlTower;
import controlTower.Harbor;

public class ControlTowerFactory {

    public static ControlTower buildTower(Coordinates location, int idNumber) {
        ControlTower harbor = new Harbor(location, idNumber);

        return harbor;

    }
}
