import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Lesson5_1{
  public static void main(String[] args){
    String copy1 = args[0];
    String copy2 = args[1];
    FileInputStream fis = null;
    GZIPOutputStream gos = null;

    try{
      fis = new FileInputStream(copy1);
      FileOutputStream fos = new FileOutputStream(copy2);
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      gos = new GZIPOutputStream(bos);
      int line = fis.read();
      while(line != -1){
        gos.write(line);
        line = fis.read();
      }
      gos.flush();
      gos.close();
      fis.close();
    }catch(IOException e){
      System.out.println("ファイル操作に失敗しました");
      try{
        if(fis != null){
          fis.close();
        }
        if(gos != null){
          gos.close();
        }
      }catch(IOException e2){}
    }
  }
}