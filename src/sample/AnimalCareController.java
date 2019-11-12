package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AnimalCareController {
  @FXML
  private TextField textField_LastGroomerVisit;
  @FXML
  private TextField textField__LastVetVisit;
  @FXML
  private DatePicker datePicker_ScheduleVetVisit;
  @FXML
  private DatePicker datePicker_ScheduleGroomerVisit;
}
