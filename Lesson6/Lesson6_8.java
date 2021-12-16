public class Lesson6_8{
  public static void main(String[] args){
    new CountUpThread().start();
    new CountUpThread().start();
    new CountUpThread().start();
  }
}

class CountUpThread extends Thread{
  public void run(){
    for(int i = 0; i < 50; i++){
      System.out.print(i);
    }
  }
}
