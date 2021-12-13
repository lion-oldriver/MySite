import java.util.*;
import java.io.*;

public class Lesson5_2{
  public static void main(String[] args) throws IOException{
    Reader fr = new FileReader("test.txt");
    Properties p = new Properties();
    p.load(fr);
    String acap = p.getProperty("aichi.capital");
    String afood = p.getProperty("aichi.food");
    System.out.println(acap + ":" + afood);
    fr.close();

    Employee tanaka = new Employee();
    tanaka.name = "田中太郎";
    tanaka.age = 41;
    Department soumubu = new Department();
    soumubu.name = "総務部";
    soumubu.leader = tanaka;
    FileOutputStream fos = new FileOutputStream("company.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(soumubu);
    oos.flush();
    oos.close();
  }

  static class Employee implements Serializable{
    String name;
    int age;
  }

  static class Department implements Serializable{
    String name;
    Employee leader;
  }
}