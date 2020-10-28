/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.*;
import conexion.Conexion;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.trabajador;

/**
 * FXML Controller class
 *
 * @author GABRIEL GARCIA ALOR
 */
public class FrmConcentradoTrabajadorController implements Initializable {

    @FXML
    private Button btnBuscar;
    @FXML
    private TextField txtBuscar;
    @FXML
    private TableView<trabajador> tableConcentradoTrabajador;
    @FXML
    private TableColumn<trabajador, String> colNombre;
    @FXML
    private TableColumn<trabajador, String> colRfc;
    @FXML
    private TableColumn<trabajador, String> colNss;
    @FXML
    private TableColumn<trabajador, String> colPuesto;
    @FXML
    private TableColumn<?, ?> colAcciones;
    @FXML
    private Button btnNuevo;
    
    @FXML ObservableList<trabajador> listaTrabajador;
    private Conexion conexion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conexion = new Conexion();
        conexion.establecerConexion();
        listaTrabajador = FXCollections.observableArrayList();
       
    
    }    

    @FXML
    private void buscarRegistro(ActionEvent event) {
    }

    @FXML
    private void agregarRegistro(ActionEvent event) {
    }
    
}
