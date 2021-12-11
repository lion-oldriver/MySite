public class Hero{
  private String name;
  private int hp,mp;

  public Hero(String name, int hp, int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  public String getName(){
    return this.name;
  }

  public String toString(){
    return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP" + this.mp + ")";
  }

  public int hashcode(){
    int result = 37;
    result = result * 31 + nameHashCode();
    result = result * 31 + hp;
    return result;
  }
}
