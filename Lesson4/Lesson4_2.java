import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;
public class Lesson4_2{
  public static void main(String[] args){
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH);
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    Date d = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(d));

    LocalDate now2 = LocalDate.now();
    LocalDate future = now2.plusDays(100);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(future.format(fmt));
  }
}