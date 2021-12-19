public class Lesson {
  public static void main(String[] args){
    int[] arr = {43, 2, 765, 234, 908, 115, 32,
                 476, 938, 65, 93, 47, 102, 735,
                 529, 1010, 639, 660, 182, 908};
    System.out.println("配列の最大:" + max(arr));
  }

  static int max(int[] arr){
    int max = 0;
    for(int i : arr){
      if(max < i){
        max = i;
      }
    }
    return max;
  }
}