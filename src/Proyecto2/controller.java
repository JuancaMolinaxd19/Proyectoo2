package Proyecto2;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;

public class controller {
    public PasswordField txtContraseña;
    public TextField txtUsuario;
    controller2 controller2;
    //new Secundario secundario= Secundario();

    public void Ingresar(ActionEvent actionEvent) {
        //validar usuario=chris, password=123456
        if(txtUsuario.getText().equals("chris")&& txtContraseña.getText().equals("123456")){
            //ingresa a la aplicacion
            JOptionPane.showMessageDialog(null, "Bienvenido, a ingresado correctamente!", "infobox", JOptionPane.INFORMATION_MESSAGE);

        }

        else{
            JOptionPane.showMessageDialog(null, "Valide sus credenciales!", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            txtUsuario.setText("");
            txtContraseña.setText("");
        }
    }
}
