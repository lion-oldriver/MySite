import java.sql.*;

public class Lesson5_4{
  public static void main(String[] args){
    
    try{
      Class.forName("org.h2.Driver");
    }catch(ClassNotFoundException e){
      e.printStackTrace();
    }

    Connection con = null;
    try{
      con = DriverManager.getConnection("jdbc:h2:~/mydb");
      con.setAutoCommit(false);

      con.commit();
    }catch(SQLException e){
      try{
        con.rollback();
      }catch(SQLException e2){
        e2.printStackTrace();
      }finally{
        if(con != null){
          try{
            con.close();
          }catch(SQLException e3){
            e3.printStackTrace();
          }
        }
      }
    }
  }
}