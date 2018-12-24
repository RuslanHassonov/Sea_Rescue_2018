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
