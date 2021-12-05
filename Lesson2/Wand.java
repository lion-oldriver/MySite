public class Wand{
  private String name;
  private double power;

  public String getName(){return this.name;}
  public void setName(String name){
    if (name == null || name.length() < 3){
      throw new IllegalArgumentException
      ("短すぎます");
    }
    this.name = name;
  }
  public double getPower(){return this.power;}
  public void setPower(double power){
    if (power < 0.5){
      throw new IllegalArgumentException
      ("パワーは0.5以上に設定してください");
    }else if(power > 100.0){
      throw new IllegalArgumentException
      ("パワーは100以下に設定してください");
    }
    this.power = power;
  }
}