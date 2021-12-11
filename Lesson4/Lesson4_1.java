import java.util.*;
public class Lesson4_1{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<100; i++){
      sb.append(i + 1).append(",");
    }
    String s = sb.toString();
    String[] a = s.split(",");
    System.out.println(Arrays.toString(a));
    
    String path = concatPath("c:¥java", "readme.txt");
    System.out.println(path);
  }

  static String concatPath(String folder, String file){
    if (!folder.matches("¥$")){
      folder += "¥";
    }
    return folder + file;
  }
}