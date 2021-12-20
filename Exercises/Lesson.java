public class Lesson {
  public static void main(String[] args){
    String[][] apartment = {
      {"後藤", "矢口", "石川", "吉澤", "藤本"},
      {"亀井", "小川", "紺野"},
      {"石川", "安部", "安田", "後藤"},
      {"石黒", "福田", "後藤"}
    };

    System.out.println("検索する名前を入力してください");
    String name = System.console().readLine();
    int count = 1;

    for(int i=0; i<apartment.length; i++){
      for(int j=0; j<apartment[i].length; j++){
        if(name.equals(apartment[i][j])){
          System.out.println(count + "人目の" + name + "さんは" + (i + 1) + "階の" + (j + 1) + "号室に住んでいます");
          count++;
        }
      }
    }
    if(count == 1){
      System.out.println(name + "さんはこのアパートに住んでいません");
    }
  }
}