import java.util.Arrays;
import java.util.List;
import java.util.regex.*;
class Main{
  public static void main(String[] args){
    String regex = "(?<!smart)phone";
    Pattern p = Pattern.compile(regex);
    String[] ary = {"smart", "smartphone", "applephone"};
    for (int i=0; i < ary.length; i++){
      Matcher m = p.matcher(ary[i]);
      System.out.print(ary[i] + "は");
      if (m.find()){
        System.out.println("マッチしました。マッチしたのは" + m.group() + "です");
      }else{
        System.out.println("マッチしませんでした");
      }
    }
  }
}
