import java.io.*;

public final class MyLogger{
  private static MyLogger theInstance;
  private FileWriter writer;
  private MyLogger(){
    try{
      this.writer = new FileWriter("dummylog.txt");
    }catch(IOException e){
      System.out.println("ファイルが開けませんでした");
    }
  }
  public void log(String str) throws IOException{
      this.writer.write(str);
      this.writer.flush();
  }
  public static MyLogger getInstance(){
    if(theInstance == null){
      theInstance = new MyLogger();
    }
    return theInstance;
  }
}