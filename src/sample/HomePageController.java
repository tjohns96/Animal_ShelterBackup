package sample;

import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.ComboBox;


public class HomePageController {

  @FXML
  public void handleAdoptableDogsMenuItem(javafx.event.ActionEvent actionEvent) {
    //This is a test to see if there is functionality to the menuitem
    System.out.println("You would like to adopt a dog!!");

  }
}

