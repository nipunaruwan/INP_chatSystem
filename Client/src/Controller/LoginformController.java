package Controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginformController {
    public JFXTextField txtuname;
    public JFXPasswordField txtpassword;

    public void btnsignin(ActionEvent actionEvent) throws IOException {
        if (txtuname.getText().equalsIgnoreCase("Dulan") && txtpassword.getText().
                equalsIgnoreCase("1234")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Dulan ").show();
            Parent load = FXMLLoader.load(getClass().getResource("../View/Client1.fxml"));
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();


        } else if (txtuname.getText().equalsIgnoreCase("Nipun") && txtpassword.getText().
                equalsIgnoreCase("1235")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Nipun ").show();
            Parent load = FXMLLoader.load(getClass().getResource("../View/Client2.fxml"));
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();


        } else if (txtuname.getText().equalsIgnoreCase("Sadun") && txtpassword.getText().
                equalsIgnoreCase("1236")) {
            new Alert(Alert.AlertType.CONFIRMATION, "Welcome Sadun ").show();
            Parent load = FXMLLoader.load(getClass().getResource("../View/Client3.fxml"));
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();


        } else {
            new Alert(Alert.AlertType.WARNING, "Please check your Username and Password").show();
clearloginOnAction();
        }
    }

        public void clearloginOnAction() {
            txtuname.clear();
            txtpassword.clear();
        }

        }




