import java.util.*;
import java.io.*;
import java.sql.*;

public class ItemDao{
  public static ArrayList<Item> findByMinimumPrice(int i){
    try{
      Class.forName("org.h2.Driver");
    }catch(ClassNotFoundException e){
      e.printStackTrace();
    }

    Connection con = null;
    ArrayList<Item> items = new ArrayList<Item>();
    try{
      con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
      con.setAutoCommit(false);
      PreparedStatement ps = con.prepareStatement("SELECT * FROM ITEMS WHERE PRICE > ?");
      ps.setInt(1, i);
      ResultSet rs = ps.executeQuery();
      while(rs.next()){
        Item item = new Item();
        item.setName(rs.getString("NAME"));
        item.setPrice(rs.getInt("PRICE"));
        item.setWeight(rs.getInt("WEIGHT"));
        items.add(item);
      }
      con.commit();
      rs.close();
      ps.close();
    }catch(SQLException e){
      e.printStackTrace();
    }finally{
      if(con != null){
        try{
          con.close();
        }catch(SQLException e){
          e.printStackTrace();
        }
      }
      return items;
    }
  }
}