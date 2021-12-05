import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;
public class Main{
  public static void main(String[] args){
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH);
    c.set(Calendar.DAY_OF_MONTH, day + 100);
    Date d = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    String s = f.format(d);
    System.out.println(s);

    LocalDate l = LocalDate.now();
    LocalDate future = l.plusDays(100);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    String str = future.format(fmt);
    System.out.println(str);
  }
}