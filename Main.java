// import java.util.Arrays;
import java.util.List;
class Main{
  public static void main(String[] args){
    String str = String.join("-", "Apple", "Grape", "Melon");
    System.out.println(str);

    List<String> strings = List.of("One", "Two", "Three");
    String str2 = String.join(" : ", strings);
    System.out.println(str2);
  }
}
