package sample;

import java.util.Date;
import javafx.fxml.FXML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {

  private static Connection conn;
  private static String animalQuery;
  private static PreparedStatement addPrepStmt;


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
  public static void checkInAnimal(String str, String str1, String str2) {
    String[] animalInformation = {str};
    int index = 1;
    try {

      //Execute a query
      animalQuery = "INSERT INTO ANIMAL(SPECIES, SUBSPECIES, CHECKINDATE) "
          + "VALUES (?, ?, ?)";

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

  public static void adoptAnimal(){
    Date today = new Date();

    animalQuery = "INSERT INTO ANIMAL(ADOPTIONDATE) VALUES (?)";
    try {
      addPrepStmt = conn.prepareStatement(animalQuery);
      addPrepStmt.setString(1, today.toString());

    } catch (Exception e) {
      e.printStackTrace();
    }


  }

  public static void animalCleanDate() {

    //animalQuery =

  }

  public static void animalCheckUpDate() {

    //animalQuery =

  }
}