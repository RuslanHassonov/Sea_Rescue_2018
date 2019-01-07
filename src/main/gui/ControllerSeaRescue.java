/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 25/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Controller voor de fxml
 */

package main.gui;

import javafx.scene.control.Button;
import main.controlTower.ControlTower;
import main.emergencyService.EmergencyService;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import main.tools.*;
import main.ships.Ship;

import javafx.event.ActionEvent;

import java.util.ArrayList;

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
    @FXML
    private Button btn_GenerateAll;
    @FXML
    private Button btn_GetNewShip;
    @FXML
    private Button btn_GetNewControlTower;
    @FXML
    private Button btn_GetNewEmergencyService;
    @FXML
    private Button btn_ClearNewActorsList;

    private ArrayList<Ship> listOfShips = new ArrayList<Ship>();
    private ArrayList<ControlTower> listOfControlTowers = new ArrayList<ControlTower>();
    private ArrayList<EmergencyService> listOfEmergencyServices = new ArrayList<EmergencyService>();

    public void initialize() {

    }

    private void getAllActors() {
        if (listOfShips.isEmpty()) {
            listOfShips = Randomizer.getRandomShips();
        } else {
            listOfShips.addAll(Randomizer.getRandomShips());
        }

        if (listOfControlTowers.isEmpty()) {
            listOfControlTowers = Randomizer.getRandomControlTowers();
        } else {
            listOfControlTowers.addAll(Randomizer.getRandomControlTowers());
        }

        if (listOfEmergencyServices.isEmpty()) {
            listOfEmergencyServices = Randomizer.getRandomEmergencyServices();
        } else {
            listOfEmergencyServices.addAll(Randomizer.getRandomEmergencyServices());
        }


    }

    private void clearNewActorList() {
        lv_NewActors.getItems().clear();
    }

    private Ship getNewShip() {
        return ShipFactory.buildSpecificShip(tf_NewShip.getText(), Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
    }

    private ControlTower getNewControlTower() {
        return ControlTowerFactory.buildTower(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
    }

    private EmergencyService getNewEmergencyService() {
        return EmergencyServiceFactory.buildSpecificEmergencyService(tf_NewEmergencyService.getText(), Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
    }

    private double getDistanceBetweenActors(Actor actor1, Actor actor2){
        return actor1.getDistance(actor2);
    }


    @FXML
    public void generateAllBtnPressed(ActionEvent event) {
        getAllActors();
        clearNewActorList();

        for (Actor c : listOfControlTowers) {
            lv_NewActors.getItems().add(c);
            lv_AllControlTowers.getItems().add((ControlTower) c);
        }

        for (Actor s : listOfShips) {
            lv_NewActors.getItems().add(s);
            lv_AllShips.getItems().add((Ship) s);

        }

        for (Actor e : listOfEmergencyServices) {
            lv_NewActors.getItems().add(e);
            lv_AllEmergencyServices.getItems().add((EmergencyService) e);
        }
    }

    @FXML
    public void getNewShipBtnPressed(ActionEvent event) {
        Actor s = getNewShip();
        lv_AllShips.getItems().add((Ship) s);
        lv_NewActors.getItems().add(s);
    }

    @FXML
    public void getNewControlTowerBtnPressed(ActionEvent event) {
        Actor c = getNewControlTower();
        lv_AllControlTowers.getItems().add((ControlTower) c);
        lv_NewActors.getItems().add(c);
    }

    @FXML
    public void getNewEmergencyServiceBtnPressed(ActionEvent event) {
        Actor e = getNewEmergencyService();
        lv_AllEmergencyServices.getItems().add((EmergencyService) e);
        lv_NewActors.getItems().add(e);
    }

    @FXML
    public void clearNewActorsListBtnPressed(ActionEvent event) {
        lv_NewActors.getItems().clear();
    }


}