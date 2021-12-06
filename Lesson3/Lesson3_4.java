import java.io.*;
public class Lesson3_4{
  public static void main(String[] args){
    String s = "三";
    try{
      int i = Integer.parseInt(s);
    }catch (NumberFormatException e){
      System.out.println("NumberFormatExceptionをcatchしました");
    }
  }
}