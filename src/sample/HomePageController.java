package sample;

import java.awt.Button;
import java.awt.MenuItem;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class HomePageController {


  public
  javafx.scene.control.MenuItem menuItem_AdoptableDogs;

  @FXML
  private ListView<String> listView_Animals = new ListView<>();

  public void loadScene(MenuItem pressedMenuItem, String nameOfFxml, String titleOftheScene) {

    try {

      Stage stage;

      // retrieves and closes current stage
      stage = (Stage) pressedMenuItem.getScene().getWindow();
      stage.close();

      // loads main screen stage
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdoptableDogs.fxml"));
      Parent profile = (Parent) fxmlLoader.load();

      // creates a new stage
      Stage newStage = new Stage();
      newStage.setTitle("Dogs Up For Adoption");
      newStage.setScene(new Scene(profile));

      // set new stage to current stage and display stage
      stage = newStage;
      stage.show();

    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }

  @FXML
  public void handleAdoptableDogsMenuItem(javafx.event.ActionEvent actionEvent) {
    //This is a test to see if there is functionality to the menuitem
    System.out.println("You would like to adopt a dog!!");

  }


  public void initialize() {
    listView_Animals.getItems().add("\t" + "EVERY PET DESERVES A FOREVER HOME");
    listView_Animals.getItems().add("Our daily mission: ");
    listView_Animals.getItems().add("° Arrive bright eyed and bushy tailed");
    listView_Animals.getItems().add("° Insure every pet feels at home");
    listView_Animals.getItems().add("° Keep animals and area clean");

  }

}

