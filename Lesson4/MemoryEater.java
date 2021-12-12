public class MemoryEater{
  public static void main(String[] args){
    long[] longer = new long[1280000];
    for (int i = 0; i < longer.length; i++){
      longer[i] = i;
    }
  }
}