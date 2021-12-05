public class Lesson2_7{
  public static void main(String[] args){
    Hero h = new Hero("hero");
    Wizard w = new Wizard();
    Wand wand = new Wand();
    w.setWand(wand);
    wand.setPower(5.5);
    w.heal(h);
  }
}