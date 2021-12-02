import java.util.Arrays;
import java.util.List;
import java.util.regex.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
class Main{
  public static void main(String[] args){
    HashMap<String,Integer> map = new HashMap<>();

    map.put("リンゴ",80);
    map.put("オレンジ",120);
    map.put("ブドウ",90);

    System.out.println(map.get("リンゴ"));
    map.putIfAbsent("メロン",140);
    System.out.println(map.containsValue(120));
  }
}
