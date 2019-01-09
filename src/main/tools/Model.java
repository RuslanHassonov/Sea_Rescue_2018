/**
 * @Autor: Lien Wittebol
 * @Date: 9/01/2019
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: PreparedStatements used by app
 */
package main.tools;

import main.emergencyService.EmergencyService;
import main.ships.Ship;
import main.controlTower.ControlTower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


public class Model {

    private static final String URL = "jdbc:derby://localhost:1527/searescue";
    private static final String USERNAME = "deitel";
    private static final String PASSWORD = "deitel";

    private Connection connection;
    private PreparedStatement selectAllShips;
    private PreparedStatement selectAllEmergencyServices;
    private PreparedStatement selectAllControlTowers;
    private PreparedStatement addNewShip;
    private PreparedStatement addNewEmergencyService;
    private PreparedStatement addNewControlTower;



    public Model() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            selectAllShips = connection.prepareStatement("SELECT * FROM Ships");
            selectAllEmergencyServices = connection.prepareStatement("SELECT * FROM EmergencyServices");
            selectAllControlTowers = connection.prepareStatement("SELECT * FROM ControlTowers");
            addNewShip = connection.prepareStatement("INSERT INTO Ships " +
                    "(typeShip, longitude, latitude, capacity, size)" +
                    "VALUES (?,?,?,?,?)");
            addNewEmergencyService = connection.prepareStatement("INSERT INTO EmergencyServices " +
                    "(typeService, longitude, latitude, capacity, size)" +
                    "VALUES (?,?,?,?,?)");
            addNewControlTower = connection.prepareStatement("INSERT INTO ControlTower " +
                    "(longitude, latitude)" +
                    "VALUES (?,?)");

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }

    //kan geen ship selecteren is abstract
    public List<Ship> getAllShips() {
        try (ResultSet resultSet = selectAllShips.executeQuery()) {
            List<Ship> results = new ArrayList<Ship>();

            while (resultSet.next()) {
                results.add(new Ship(
                        resultSet.getString("typeShip"),
                        resultSet.getString("longitude"),
                        resultSet.getString("latitude"),
                        resultSet.getString ("capacity"),
                        resultSet.getString ("size")));
            }

            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }

    public List<EmergencyService> getAllEmergencyServices() {
        try (ResultSet resultSet = selectAllEmergencyServices.executeQuery()) {
            List<EmergencyService> results = new ArrayList<EmergencyService>();

            while (resultSet.next()) {
                results.add(new EmergencyService(
                        resultSet.getString("typeService"),
                        resultSet.getString("longitude"),
                        resultSet.getString("latitude"),
                        resultSet.getString("capacity"),
                        resultSet.getString("size")) {
                });
            }

            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }

    public List<ControlTower> getAllControlTowers() {
        try (ResultSet resultSet = selectAllControlTowers.executeQuery()) {
            List<ControlTower> results = new ArrayList<ControlTower>();

            while (resultSet.next()) {
                results.add(new ControlTower(
                        resultSet.getString("longitude"),
                        resultSet.getString("latitude")) {
                });
            }

            return results;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }

    public int addShip(String typeShip, double latitude, double longitude, int capacity, int size) {

        try {
                addNewShip.setString(1, typeShip);
                addNewShip.setDouble(2, latitude);
                addNewShip.setDouble(3, longitude);
                addNewShip.setInt(4, capacity);
                addNewShip.setInt(5, size);

                return addNewShip.executeUpdate();
            }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return 0;
        }
    }

    public int addEmergencyService(String typeService, double latitude, double longitude, int capacity, int size) {

        try {
            addNewEmergencyService.setString(1, typeService);
            addNewEmergencyService.setDouble(2, latitude);
            addNewEmergencyService.setDouble(3, longitude);
            addNewEmergencyService.setInt(4, capacity);
            addNewEmergencyService.setInt(5, size);

            return addNewEmergencyService.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return 0;
        }
    }

    public int addControlTower(double latitude, double longitude) {

        try {
            addNewControlTower.setDouble(2, latitude);
            addNewControlTower.setDouble(3, longitude);

            return addNewControlTower.executeUpdate();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
            return 0;
        }
    }
    public void close() {
        try {
            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}


