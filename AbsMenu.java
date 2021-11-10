import java.sql.*;
import java.io.*;

public abstract class AbsMenu
{
  protected Connection dbConnection;

  public AbsMenu(Connection dbConnection)
  {
    this.dbConnection = dbConnection;
  }
}