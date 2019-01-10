
package main.ships;
/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: factory maakt verschillende main.ships aan
 */
import main.ships.*;
import main.tools.AbstractFactory;
import main.tools.Coordinates;
import main.tools.Randomizer;

public class ShipFactory extends AbstractFactory {

    public ShipFactory(String typeFactory) {
        super(typeFactory);
    }

    public static Ship buildAShip(String shipName) {
        Ship newShip = null;

        if ("TANKER".equalsIgnoreCase(shipName)) {
            newShip = new Tanker(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        } else if ("FERRY".equalsIgnoreCase(shipName)) {
            newShip = new Ferry(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        } else if ("CRUISE SHIP".equalsIgnoreCase(shipName) || "CRUISESHIP".equalsIgnoreCase(shipName)) {
            newShip = new CruiseShip(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        } else if ("FISHER".equalsIgnoreCase(shipName)) {
            newShip = new Fisher(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        } else if ("SPEED BOAT".equalsIgnoreCase(shipName) || "SPEEDBOAT".equalsIgnoreCase(shipName)) {
            newShip = new SpeedBoat(Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        }

        if (newShip == null){
            throw new NullPointerException();
        }

        return newShip;
    }

}
