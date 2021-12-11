import java.util.*;
public class Lesson4_3{
  public static void main(String[] args){
    Hero h1 = new Hero("斉藤");
    Hero h2 = new Hero("鈴木");
    Map<Hero, Integer> lists = new HashMap<Hero, Integer>();
    lists.put(h1, 3);
    lists.put(h2, 7);
    for (Hero key : lists.keySet()){
      int value = lists.get(key);
      System.out.println(key.getName() + "が倒した敵の数=" + value);
    }
  }
}