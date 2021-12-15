import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest{
  @Test public void instantiate(){
    Account a = new Account("ミナト", 30000);
    assertEquals("ミナト", a.owner);
    assertEquals(30000, a.balance);
  }
  @Test void transfer(){
    
  }
}