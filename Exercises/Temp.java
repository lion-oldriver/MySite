import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Temp {
  public static void main(String[] args){
    try{
      FileReader fr = new FileReader("data.csv");
      BufferedReader br = new BufferedReader(fr);
      String text;
      ArrayList<String[]> tempList = new ArrayList<String[]>();
      while ((text = br.readLine()) != null){
        String[] data = text.split(",");
        tempList.add(data);
      }
      br.close();

      TemperatureComparator tc = new TemperatureComparator();
      Collections.sort(tempList, tc);
      for(String[] data : tempList){
        System.out.println(data[1] + "," + data[2] + "," + data[3] + "," +  data[0]);
      }
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
