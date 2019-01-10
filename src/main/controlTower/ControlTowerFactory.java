package main.controlTower;

/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */

import main.tools.AbstractFactory;
import main.tools.Coordinates;

public class ControlTowerFactory extends AbstractFactory {

    public ControlTowerFactory(String typeFactory) {
        super(typeFactory);
    }

    public static ControlTower buildTower(Coordinates location, int idNumber) {
        ControlTower harbor = new ControlTower(location, idNumber) {
        };

        return harbor;

    }
}
