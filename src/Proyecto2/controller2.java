package Proyecto2;

import Proyecto2.Cliente;
import Proyecto2.DataSistema;
import Proyecto2.Individual;
import Proyecto2.Empresa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class controller2 {
    public MenuBar menu;
    public TextField txtNombreCarrera;
    public TableView tblCarreras;
    public TableColumn tfid;
    public TableColumn tfNombre;
    public TableColumn tfApellido;
    public TableColumn tfNit;
    public TableColumn tfDireccion;
    public TableColumn tfDPI;
    public Pane paneCliente;

    public controller2(){
    }

    @FXML
    public void initialize() {
        tfid.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("id"));
        tfNombre.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombre"));
        tfApellido.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellido"));
        tfNit.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nit"));
        tfDireccion.setCellValueFactory(new PropertyValueFactory<Cliente, String>("direccion"));
        tfDPI.setCellValueFactory(new PropertyValueFactory<Cliente, String>("DPI"));
    }

    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) menu.getScene().getWindow();
        stage.close();
    }

    public void addCarrera(ActionEvent actionEvent) {
        try {
            DataSistema.listaClientes.add(new Individual("Juan","Molina","202054897","2 av B 0-30 zona 10","8970203011057"));
            //VariablesGlobales.u1.addCarrera(new Carrera(txtNombreCarrera.getText()));
            ObservableList<Cliente> data = FXCollections.observableArrayList(DataSistema.listaClientes);
            tblCarreras.setItems(data);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void showCarrera(ActionEvent actionEvent) {
        paneCliente.setVisible(true);
    }
}