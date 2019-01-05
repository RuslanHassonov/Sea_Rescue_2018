/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 25/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Controller voor de fxml
 */

package main.gui;

import main.controlTower.ControlTower;
import main.emergencyService.EmergencyService;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import main.tools.Actor;
import main.ships.Ship;

public class ControllerSeaRescue {

    @FXML
    private ListView<Actor> lv_NewActors;
    @FXML
    private ListView<Ship> lv_AllShips;
    @FXML
    private ListView<ControlTower> lv_AllControlTowers;
    @FXML
    private ListView<EmergencyService> lv_AllEmergencyServices;
    @FXML
    private TextField tf_NewShip;
    @FXML
    private TextField tf_NewControlTower;
    @FXML
    private TextField tf_NewEmergencyService;
}
