import org.junit.jupiter.api.Test;
import problem2.Account;

public class CustomerTest {
    Account acc1 = new Account("Thor", "123 HappyPup St", 15, 13465855);

    @Test
    public void mailCheckTest(){
        acc1.mailCheck();
        new Account("Loki", "123 HappyPup St", 15, 13465856).mailCheck();
        //Don't get any ideas, they're brother and sister
    }
}
