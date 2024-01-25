import org.junit.jupiter.api.Test;
import problem1.Driver;
import problem1.Passenger;

public class PersonTest {
    Driver d = new Driver("Toby", 17);
    Driver d1 = new Driver("Loki", 4);
    Passenger p = new Passenger("Thor", 4);

    @Test
    public void getDetailsTest(){
        d.getDetails();
        d1.getDetails();
        p.getDetails();
    }

}
