import java.sql.*;
import java.io.*;

public class SearchCustomerMenu extends AbsMenu
{
  public SearchCustomerMenu(Connection dbConnection)
  {
    super(dbConnection);

    boolean proceed = true;
    while(proceed)
    {
      System.out.println("Suche Kunden - Funktionen\n");
      System.out.println("1 - Suche Kunde anhand Kundennummer");
      System.out.println("2 - Suche Kunde anhand Name");
      System.out.println("0 - zurück\n");
      System.out.print("Geben Sie die Nummer der gewünschten Funktion ein: ");

      String input = System.console().readLine();
      switch (input)
      {
        case "1":
          searchCustomerByNumber();
          break;
        case "2":
          searchCustomerByName();
          break;
        case "0":
          proceed = false;
          break;
        default:
          System.out.println("Ungültig Eingabe. Bitte wiederholen!");
          break;
      }
    }
  }

  private void searchCustomerByNumber()
  {
    //Teilaufgabe 5) (a)

    //Eingabe Kundennummer

    //Suche Kunde mit Kundennummer in Datenbank

    //Ausgabe des gefundenen Kunden

  }

  private void searchCustomerByName()
  {
    //Teilaufgabe 5) (b)

    //Eingabe Name

    //Suche Kunden mit Name in Datenbank

    //Ausgabe der gefundenen Kunden

  }
}