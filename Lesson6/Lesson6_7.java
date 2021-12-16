import java.util.*;

public class Lesson6_7{
  public static void main(String[] args){
    System.out.println("何か入力してください");
    Thread t = new PrintingThread();
    t.start();
    new Scanner(System.in).nextLine();
  }
}

class PrintingThread extends Thread{
  public void run(){
    for(int i=0; i<10; i++){
      System.out.print(i);
    }
  }
}