public class Hero{
  String name;
  private int hp;
  Sword sword;

  public void attack(Matango m){
    System.out.println(this.name + "の攻撃");
    m.hp -= 5;
  }

  public void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した");
  }

  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は" + sec + "秒座った");
    System.out.println("HPが" + sec + "ポイント回復した");
  }

  public void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は転んだ");
    System.out.println("5のダメージ");
  }

  public void run(){
    System.out.println(this.name + "は逃げ出した");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }

  private void die(){
    System.out.println(this.name + "は死んでしまった");
    System.out.println("GAMEOVERです");
  }

  public String getName(){return this.name;}
  public int getHp(){return this.hp;}
  public void setHp(int hp){this.hp = hp;}

  public Hero(String name){
    this.hp = 100;
    this.name = name;
  }

  public Hero(){
    this("ダミー");
  }
}