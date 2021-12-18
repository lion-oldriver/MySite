public class Main {
  public static void main(String[] args){
    MyCar car = new MyCar();
    System.out.println("車種は" + car.getCarModel() + "です");
    System.out.println("乗車定員は" + car.getCapacity() + "です");
    System.out.println("車種区分は" + car.getCarTypeString() + "です");
  }
}