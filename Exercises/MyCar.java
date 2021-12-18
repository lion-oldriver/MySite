public class MyCar extends AbstractAutomobile{

  protected MyCar(){
    super(CarType.STANDERD_CAR);
  }

  public String getCarModel(){
    return "自家用ワンボックスカー";
  }

  public int getCapacity(){
    return 7;
  }

}

