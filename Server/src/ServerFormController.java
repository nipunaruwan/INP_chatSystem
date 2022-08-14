import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class ServerFormController implements Initializable {
    public TextArea txttextareaserver;
    public TextField txtserver;

    static ServerSocket serverSocket;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;
    static Socket socket;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
new Thread(()->{
    try {
        serverSocket= new ServerSocket(5000);
        System.out.println("");
    } catch (IOException e) {
        e.printStackTrace();
    }
});
    }

    public void btnserversend(ActionEvent actionEvent) {


    }


}
