import org.junit.jupiter.api.Test;
import problem4.Ford;
import problem4.Volkwagen;

public class VehicleTest {
    Volkwagen v = new Volkwagen(6, 60, 55000);
    Ford f = new Ford(5, 55, 78000);

    @Test
    public void toStringTest(){
        v.toString();
        f.toString();
    }

    @Test
    public void accelBrakeTest(){
        v.accelerate(10);
        System.out.println("New Speed of V: " + v.getSpeed());
        f.accelerate(15);
        System.out.println("New Speed of F: " +f.getSpeed());

        v.brake(20);
        System.out.println("New Speed of V: " + v.getSpeed());
        f.brake(33);
        System.out.println("New Speed of F: " + f.getSpeed());
    }
}
