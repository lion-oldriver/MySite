import java.lang.reflect.*;
public class Launcher{
  public static void main(String[] args){
    String fqcn = args[0];
    String sw = args[1];
    showMemory();
    try{
      Class<?> clazz = Class.forName(fqcn);
      Methods(clazz);
      if (sw.equals("E")){
        Estart(clazz);
      }else if (sw.equals("I")){
        Istart(clazz);
      }else{
        throw new IllegalArgumentException("起動方法が不正です");
      }
    }catch(Exception e){
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
    showMemory();
    System.exit(0);
  }

  public static void showMemory(){
    long free = Runtime.getRuntime().freeMemory();
    long total = Runtime.getRuntime().totalMemory();
    long used = (total - free) / 1024 / 1024;
    System.out.println("現在のメモリ使用量" + used + "MB");
  }

  public static void Methods(Class<?> clazz) throws Exception{
    System.out.println("メソッド一覧");
    Method[] methods = clazz.getDeclaredMethods();
    for (Method m : methods){
      System.out.println(m.getName());
    }
  }

  public static void Estart(Class<?> clazz) throws Exception{
    ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
    Process proc =pb.start();
    proc.waitFor();
  }

  public static void Istart(Class<?> clazz) throws Exception{
    Method m = clazz.getMethod("main", String[].class);
    String[] args ={};
    m.invoke(null, (Object)args);
  }
}