package sample;

import java.awt.Button;
import java.awt.MenuItem;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class HomePageController {

  public
  javafx.scene.control.MenuItem menuItem_AdoptableDogs;

  @FXML
  private AnchorPane rootPane;

  @FXML
  private ListView<String> listView_Animals = new ListView<>();


  @FXML
  public void handleAdoptableDogsMenuItem(javafx.event.ActionEvent actionEvent) throws IOException {
    //This is a test to see if there is functionality to the menuitem
    System.out.println("You would like to adopt a dog!!");
    AnchorPane pane = FXMLLoader.load(getClass().getResource("AdoptableDogs.fxml"));
    rootPane.getChildren().setAll(pane);
  }

  @FXML
  public void handleAdoptableCatsMenuItem(ActionEvent actionEvent) throws IOException {
    AnchorPane pane = FXMLLoader.load(getClass().getResource("AdoptableCats.fxml"));
    rootPane.getChildren().setAll(pane);
  }

  @FXML
  public void handleGroomersMenuItem(ActionEvent actionEvent) throws IOException {
    AnchorPane pane = FXMLLoader.load(getClass().getResource("Groomers.fxml"));
    rootPane.getChildren().setAll(pane);
  }

  @FXML
  public void handleAnimalInfoMenuItem(ActionEvent actionEvent) throws IOException {
    AnchorPane pane = FXMLLoader.load(getClass().getResource("AnimalInformation.fxml"));
    rootPane.getChildren().setAll(pane);
  }

  @FXML
  public void handleAnimalCareMenuItem(ActionEvent actionEvent) throws IOException {
    AnchorPane pane = FXMLLoader.load(getClass().getResource("AnimalCare.fxml"));
    rootPane.getChildren().setAll(pane);
    System.out.println("You would like to adopt a dog!!");
  }

  /**
   * This method will initialize the ComboBox on the HomePage
   * with text about the animal shelters mission .. giving a better
   * user home screen
   */
  public void initialize() {
    listView_Animals.getItems().add("\t" + "EVERY PET DESERVES A FOREVER HOME");
    listView_Animals.getItems().add("Our daily mission: ");
    listView_Animals.getItems().add("° Arrive bright eyed and bushy tailed");
    listView_Animals.getItems().add("° Insure every pet feels at home");
    listView_Animals.getItems().add("° Keep animals and area clean");

  }
}

