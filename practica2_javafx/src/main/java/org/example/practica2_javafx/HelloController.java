package org.example.practica2_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class HelloController {

    @FXML
    private TableView<Estudiante> tablaEstudiante;

    @FXML
    private TableColumn<Estudiante, Integer> niaTableview;

    @FXML
    private TableColumn<Estudiante, String> nombreTableview;

    @FXML
    private TableColumn<Estudiante, LocalDate> fechaTableview;

    @FXML
    private TextField niaTextField;

    @FXML
    private TextField nombreTextField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button addButton;

    //siempre el controlador tiene que initializarse
    @FXML
    public void initialize(){

    }


    @FXML
    protected void onAnyadirEstudiante() {



    }
}