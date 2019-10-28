package sample;

import java.awt.TextField;
import java.util.ArrayList;
import javafx.fxml.FXML;

public class Controller {
  @FXML private TextField txt_animalSpecies;
  @FXML private TextField txt_animalSubSpecies;
  @FXML private TextField txt_checkInDate;
  @FXML private TextField txt_adoptionDate;


  @FXML
  public void initialize() {

    DatabaseManager.initializeDb();
    DatabaseManager.checkInAnimal("Test Animal");
  }


  public void addAnimal(){
    ArrayList<String> userInfo = new ArrayList<>();

    //userInfo.addAll

    DatabaseManager.checkInAnimal("Test Animal");
  }

}
