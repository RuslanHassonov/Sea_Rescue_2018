/**
 * @Autor: Ruslan Hasanov & Lien Wittebol
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose:
 */
package tools;

public abstract class AbstractFactory {

    private String typeFactory;

    public AbstractFactory (String typeFactory){
        this.typeFactory = typeFactory;
    }

    /*private void createActor(){
        if (typeFactory.equalsIgnoreCase("SHIPS")){
            ShipFactory.buildShip(Randomizer.randomShipType, Randomizer.getRandomLocation(), Randomizer.getRandomIdentificationNumber());
        }
    }*/
}
