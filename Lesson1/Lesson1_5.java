class Lesson1_5{
  public static void main(String[] args){
    String name = "マイク";
    int age = 20;
    double height = 180.5;
    char zodiac = '子';
    System.out.println(introduceOneself(name, age, height, zodiac));
    
    System.out.println("--------");
    
    String title = "こんにちは";
    String address = "sample@gmail.com";
    String text = "お世話になっております";
    String[] email = email(title, address, text);
    for (String i : email){
      System.out.println(i);
    }

    System.out.println("--------");

    String[] email2 = email(address, text);
    for (String i : email2){
      System.out.println(i);
    }

    System.out.println("--------");

    double bottom = 10.0;
    double tri_height = 5.0;
    double tri_ans = calcTriangleArea(bottom, tri_height);
    System.out.println("三角形の底辺の長さが" + bottom + "cm,高さが" + height +
                        "の場合,面積は" + tri_ans + "㎠");

    System.out.println("--------");

    double radius = 5.0;
    double cir_ans = calcCircleArea(radius);
    System.out.println("円の半径が" + radius + "の場合,面積は" + cir_ans + "㎠");
  }

  public static String introduceOneself(String name, int age, double height, char zodiac){
    String introduction = ("私は" + name + "," + age + "歳で身長" +
                            height + "cm,干支は" + zodiac + "です");
    return introduction;
  }

  public static String[] email(String title, String address, String text){
    String email_report = (address + "に、以下のメールを送信しました");
    String email_title = ("件名: " + title);
    String email_text = ("本文: " + text);
    String[] email = {email_report, email_title, email_text};
    return email;
  }

  public static String[] email(String address, String text){
    String email_report = (address + "に、以下のメールを送信しました");
    String email_title = ("件名: 無題");
    String email_text = ("本文: " + text);
    String[] email = {email_report, email_title, email_text};
    return email;
  }

  public static double calcTriangleArea(double bottom, double height){
    double ans = (bottom * height) / 2;
    return ans;
  }

  public static double calcCircleArea(double radius){
    double ans = radius * radius * 3.14;
    return ans;
  }
}