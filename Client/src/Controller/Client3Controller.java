package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class Client3Controller implements Initializable {
    public TextArea txtclientthreearea;
    public TextField txtclientthree;
    public Label lblname3;

    static Socket socket = null;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;

    String messageIn = "";
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    socket=new Socket("localhost",5000);
                    dataInputStream=new DataInputStream(socket.getInputStream());
                    dataOutputStream=new DataOutputStream(socket.getOutputStream());



                    while (!messageIn.equals("end")){
                        messageIn=dataInputStream.readUTF();
                        txtclientthreearea.appendText("\nServer :"+messageIn.trim()+"\n");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
    public void btnclient3(ActionEvent actionEvent) throws IOException {
        String reply = "";
        reply=txtclientthree.getText();
       txtclientthreearea.appendText(("Sadun:" +" " +reply.trim())+"\n");
        dataOutputStream.writeUTF(reply);
        txtclientthree.setText("");
    }


}
