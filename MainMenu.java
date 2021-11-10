import java.sql.*;
import java.io.*;

public class MainMenu extends AbsMenu
{
  public MainMenu(Connection dbConnection)
  {
    super(dbConnection);

    while(true)
    {
      System.out.println("Medikamentenverwaltung - Funktionen\n");
      System.out.println("1 - Hinzufügen Kunde");
      System.out.println("2 - Suche Kunde");
      System.out.println("3 - Hinzufügen Medikament");
      System.out.println("4 - Suche Medikament");
      System.out.println("5 - Verkauf durchführen");
      System.out.println("6 - Verkauf suchen");
      System.out.println("0 - Programm beenden\n");
      System.out.print("Geben Sie die Nummer der gewünschten Funktion ein: ");

      String input = System.console().readLine();
      switch (input)
      {
        case "1":
          addCustomer();
          break;
        case "2":
          searchCustomer();
          break;
        case "3":
          addDrug();
          break;
        case "4":
          searchDrug();
          break;
        case "5":
          sellDrug();
          break;
        case "6":
          searchSale();
          break;
        case "0":
          System.out.println("Auf wiedersehen.");
          System.exit(0);
          break;
        default:          
          System.out.println("Ungültig Eingabe. Bitte wiederholen!");
          break;
      }
    }
  }

  private void addCustomer()
  {
    //Teilaufgabe 4)
  }

  private void searchCustomer()
  {
    new SearchCustomerMenu(dbConnection);
  }

  private void addDrug()
  {
    //Teilaufgabe 6)
  }

  private void searchDrug()
  {
    new SearchDrugMenu(dbConnection);
  }

  private void sellDrug()
  {
    //Teilaufgabe 8)
  }

  private void searchSale()
  {
    new SearchSaleMenu(dbConnection);
  }
}