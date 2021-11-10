import java.sql.*;

public class Program
{
  static final String DB_URL = "jdbc:mysql://localhost:3306";
  static final String USER = "root";
  static final String PASS = "";

  public static void demoAccessDatabase(Connection dbConnection)
  {
    try
    {
      Statement stmt = dbConnection.createStatement();
      stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS STUDENT");
      stmt.executeUpdate("USE STUDENT");
      stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Employee(id int, name varchar(30))");
      stmt.executeUpdate("INSERT INTO Employee VALUES (0, 'Don Johnson')");
      ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
      while (rs.next()) 
      {
        int id = rs.getInt("id");
        String name = rs.getString("name");

        System.out.printf("%d (%s)\n", id, name);
      }
      rs.close();
      stmt.close();
    }
    catch (SQLException se)
    {
      se.printStackTrace();
    }
  }

  public static void createTables(Connection dbConnection)
  {
    //Teilaufgabe 3)
  }

  public static void main(String[] args)
  {
    Connection dbConnection = null;
    try 
    {
      dbConnection = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Verbindung zur Datenbank hergestellt");

      createTables(dbConnection);

      //demoAccessDatabase(dbConnection);

      new MainMenu(dbConnection);

      dbConnection.close();
    }
    catch (SQLException se) 
    {
      se.printStackTrace();
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
  }
}