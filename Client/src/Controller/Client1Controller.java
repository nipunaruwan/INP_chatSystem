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

public class Client1Controller implements Initializable {
    public TextArea txtclientonearea;
    public TextField txtclientone;

    static Socket socket = null;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;
    public Label lblclient1name;

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
                       txtclientonearea.appendText("\nServer :"+messageIn.trim()+"\n");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

    public void btnclient1(ActionEvent actionEvent) throws IOException {

        String reply ="";
        reply=txtclientone.getText();
        txtclientonearea.appendText(("\\t\\t\\t\\t\\t\\t\\t\\tmalith:"+reply.trim()));
        dataOutputStream.writeUTF(reply);
        txtclientone.setText("");
    }



}
