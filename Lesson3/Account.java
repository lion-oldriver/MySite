public class Account{
  String accountNumber;
  int balance;

  public String toString(){
    return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
  }

  public boolean equals(Object o){
    if (this == o){return true;}
    if (o instanceof Account){
      Account a = (Account)o;
      String account1 = this.accountNumber.trim();
      String account2 = a.accountNumber.trim();
      if (account1.equals(account2)){
        return true;
      }
    }
    return false;
  }
}