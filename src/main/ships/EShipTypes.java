package main.ships;

import java.util.Random;

public enum EShipTypes {
    CRUISE_SHIP("CRUISESHIP"),
    TANKER("TANKER"),
    FERRY("FERRY"),
    SPEED_BOAT("SPEEDBOAT"),
    FISHER("FISHER");

    private final String text;

    EShipTypes(final String text) {
        this.text = text;
    }

    public static EShipTypes getRandomShip() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    @Override
    public String toString() {
        return text;
    }
}
