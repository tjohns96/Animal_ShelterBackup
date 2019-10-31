package sample;

import javafx.fxml.FXML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {

  private static Connection conn;
  private static String animalQuery;
  private static String delQuery;
  private static PreparedStatement addPrepStmt;
  private static int index= 1;
  private static String[] animalInformation;


  public static Connection initializeDb() {
    final String jdbcDriver = "org.h2.Driver";
    final String db_Url = "jdbc:h2:./res/competitionboard";
    //  Database credentials
    // to create a database username and password,
    // type Create USER [username] WITH PASSWORD "[password]"
    // to allow the user to edit the database use GRANT ALTER ANY SCHEMA TO [username]; in console
    final String user = "admin";
    final String pass = "TestPassword";


    try {
      // STEP 1: Register JDBC driver
      Class.forName(jdbcDriver);

      //STEP 2: Open a connection
      conn = DriverManager.getConnection(db_Url, user, pass);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return conn;
  }

  @FXML
  public static void checkInAnimal(String animal, String species, String subSpecies, String checkInDate) {
    animalInformation = new String[] {animal, species, subSpecies, checkInDate};
    try {

      //Execute a query
      animalQuery = "INSERT INTO ANIMAL(NAME, SPECIES, SUBSPECIES, CHECKINDATE)"
          + "VALUES (?, ?, ?, ?)";

      addPrepStmt = conn.prepareStatement(animalQuery);
      for (String s : animalInformation) {
        System.out.println(s);
        addPrepStmt.setString(index, s);
        index++;
      }
      addPrepStmt.executeUpdate();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void adoptAnimal(String name, String adoptionDate) {
    animalInformation = new String[]{name, adoptionDate};
    try {

      //Execute a query
      animalQuery = "UPDATE ANIMAL SET ADOPTIONDATE = ? WHERE NAME = ?";

      addPrepStmt = conn.prepareStatement(animalQuery);
      for (String s : animalInformation) {
        System.out.println(s);
        addPrepStmt.setString(index, s);
        addPrepStmt.setString(index, s);
        index++;
      }
      addPrepStmt.executeUpdate();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}