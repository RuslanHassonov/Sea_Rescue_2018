package main.tools;

import main.controlTower.ControlTower;
import main.controlTower.Harbor;

public class ControlTowerFactory {

    public static ControlTower buildTower(Coordinates location, int idNumber) {
        ControlTower harbor = new Harbor(location, idNumber);

        return harbor;

    }
}
