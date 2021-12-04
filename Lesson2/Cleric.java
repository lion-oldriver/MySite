import java.util.Random;
public class Cleric{
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid(){
    System.out.println("セルフエイドを唱えた");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した");
  }

  public int pray(int sec){
    System.out.println(this.name + "は" +  sec + "秒間祈った");
    int recover = new Random().nextInt(3) + sec;
    if (this.mp + recover > this.MAX_MP){
      recover = this.MAX_MP - this.mp;
      this.mp = this.MAX_MP;
    }else{
      this.mp += recover;
    }
    System.out.println("MPが" + recover + "回復しました");
    return recover;
  }
}