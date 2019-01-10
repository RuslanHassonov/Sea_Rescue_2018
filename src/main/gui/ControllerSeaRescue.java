/**
 * @Autor: Ruslan Hasanov
 * @Date: 25/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: Controller voor de fxml
 */

package main.gui;

import javafx.scene.control.Button;
import main.controlTower.ControlTower;
import main.controlTower.ControlTowerFactory;
import main.emergencyService.EmergencyService;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import main.emergencyService.EmergencyServiceFactory;
import main.interfaces.IObserver;
import main.ships.ShipFactory;
import main.tools.*;
import main.ships.Ship;

import javafx.event.ActionEvent;

import java.util.*;

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
    private ListView<Ship> lv_registeredShips;
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

    private ArrayList<Ship> listOfShips;
    private ArrayList<ControlTower> listOfControlTowers;
    private ArrayList<EmergencyService> listOfEmergencyServices;

    public void initialize(){
        listOfShips = new ArrayList<Ship>();
        listOfControlTowers = new ArrayList<ControlTower>();
        listOfEmergencyServices =new ArrayList<EmergencyService>();

        lv_AllControlTowers.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) -> {
                    displayShips(newValue);
                }
        );
    }


    private static final int MAX_SHIPS = 5;
    private static final int MAX_TOWERS = 3;
    private static final int MAX_EMERGENCYSERVICES = 3;

    private static Random random = new Random();

    private void getAllActors() {
        Ship newShip = null;

        for (int i = 0; i < 3 + random.nextInt(MAX_TOWERS); i++) {
            listOfControlTowers.add(Randomizer.getRandomControlTowers());
        }

        for (int i = 0; i < 3 + random.nextInt(MAX_EMERGENCYSERVICES); i++) {
            listOfEmergencyServices.add(Randomizer.getRandomEmergencyServices());
        }

        for (int i = 0; i < 3 + random.nextInt(MAX_SHIPS); i++) {
            newShip = Randomizer.getRandomShips();
            ControlTower t = null;
            double distance = 0;
            double closestDistance = Double.MAX_VALUE;

            for (Actor tower : listOfControlTowers) {
                distance = newShip.getDistance(tower);

                if (distance < closestDistance){
                    closestDistance = distance;
                    t = (ControlTower) tower;
                }
            }
            t.registerObserver(newShip);
            listOfShips.add(newShip);
        }


    }

    private void clearNewActorList() {
        lv_NewActors.getItems().clear();
    }

    private Ship getNewShip() {
        return ShipFactory.buildAShip(tf_NewShip.getText());
    }

    private ControlTower getNewControlTower() {
        return ControlTowerFactory.buildTower(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
    }

    private EmergencyService getNewEmergencyService() {
        return EmergencyServiceFactory.buildEmergencyService(tf_NewEmergencyService.getText());
    }

    private void displayShips(ControlTower tower){

        for (Ship s: tower.listOfRegisteredShips){
            lv_registeredShips.getItems().add(s);
        }
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
