
import main.controlTower.ControlTower;
import main.controlTower.ControlTowerFactory;
import main.emergencyService.EmergencyService;
import main.emergencyService.EmergencyServiceFactory;
import main.emergencyService.SeaKingHelicopter;
import main.ships.Ship;
import main.ships.ShipFactory;
import main.ships.Tanker;
import main.tools.Actor;
import main.tools.Coordinates;
import main.tools.Identification;
import main.tools.Randomizer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestCase {

    private ShipFactory shipFactory;
    private ControlTowerFactory controlTowerFactory;
    private EmergencyServiceFactory emergencyServiceFactory;

    /*@Before
    public void setUp(){

    }*/

    @Test
    public void testCreateEmergencyService() {
        SeaKingHelicopter seaKing = new SeaKingHelicopter();
        assertThat(seaKing, instanceOf(EmergencyService.class));
    }
    @Test
    public void testCreateAShip() {
        Tanker tanker = new Tanker();
        assertThat(tanker, instanceOf(Ship.class));
    }

    @Test
    public void testCreateTower(){
        ControlTower tower = new ControlTower();
        assertThat(tower, instanceOf(Actor.class));
    }

    @Test
    public void testGetIdentification(){
        Ship tanker = new Tanker(Randomizer.getRandomLocation(), 123);
        assertEquals("TNK-123", tanker.getIdentification().toString());
    }

    @Test
    public void testGetRandomLocation(){
        Coordinates location = Randomizer.getRandomLocation();
        assertThat(location, instanceOf(Coordinates.class));
    }

}
