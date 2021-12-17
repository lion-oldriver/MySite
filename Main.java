import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    try{
      FileReader fr = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(fr);
      String line;
      Map<String, String> pref = new TreeMap<String, String>(new NameComparator());
      while((line = br.readLine()) != null){
        String[] list = line.split(" ");
        pref.put(list[0], list[1]);
      }
      br.close();
      for(String key : pref.keySet()){
        String value = pref.get(key);
        System.out.println(key + " : " + value);
      }
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }catch(IOException e2){
      e2.printStackTrace();
    }
  }
}

class NameComparator implements Comparator<String>{
  @Override
  public int compare(String o1, String o2){
    if(o1.length() > o2.length()){
      return 1;
    }else if(o1.length() < o2.length()){
      return -1;
    }
    return o1.compareTo(o2);
  }
}
