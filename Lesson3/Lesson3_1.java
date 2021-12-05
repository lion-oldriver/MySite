public class Lesson3_1{
  public static void main(String[] args){
    Account a = new Account();
    a.accountNumber = "4649";
    a.balance = 1592;
    Account b = new Account();
    b.accountNumber = " 4649";
    b.balance = 9215;
    System.out.println(a.toString());
    if (a.equals(b) == true){
      System.out.println("同じ口座番号です");
    }else{
      System.out.println("違う口座番号です");
    }
  }
}