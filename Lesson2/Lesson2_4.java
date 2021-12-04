public class Lesson2_4{
  public static void main(String[] args){
    Hero h = new Hero();
    PoisonMatango pw = new PoisonMatango('A');
    System.out.println(pw.suffix);
    System.out.println(pw.hp);
    pw.attack(h);
  }
}