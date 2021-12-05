import java.time.*;
public class Lesson3_2{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    for (int i=1; i<101; i++){
      sb.append(i + ",");
    }
    String s = sb.toString();
    String[] a = s.split(",");

    String folder = "desktop/lesson";
    String file = "part1";

    System.out.println(JoinPath(folder, file));
  }

  public static String JoinPath(String folder, String file){
    if (!folder.endsWith("/")){
      folder += "/";
    }
    return folder + file;
  }
}