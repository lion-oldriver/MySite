public class Lesson2_2{
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;

    Cleric c = new Cleric();
    c.name = "cleric";

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    h.sit(5);
    c.selfAid();
    c.pray(4);
    h.run();
  }
}