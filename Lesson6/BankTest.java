import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest{
  @Test public void setName(){
    Bank b = new Bank();
    b.setName("日本銀行");
  }

  @Test public void setNameNull(){
    try{
      Bank b = new Bank();
      b.setName(null);
    }catch(NullPointerException e){
      return;
    }
    fail();
  }

  @Test public void setNameShort(){
    try{
      Bank b = new Bank();
      b.setName("銀行");
    }catch(IllegalArgumentException e){
      return;
    }
    fail();
  }
}