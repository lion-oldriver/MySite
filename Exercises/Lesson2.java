public class Lesson2 {
  public static void main(String[] args){
    Employee employee = new Employee();

    employee.setData(1234, "山田");

    System.out.println("社員番号" + employee.getId());

    System.out.println("社員名" + employee.getName());
  }

  public static class Employee{
    private int id;
    private String name;

    public Employee(){
    }

    public int getId(){
      return this.id;
    }

    public String getName(){
      return this.name;
    }

    public void setData(int id, String name){
      this.id = id;
      this.name = name;
    }
  }
}
