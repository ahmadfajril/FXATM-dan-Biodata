/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lordius ~#
 */
public class FXMLLatihanController implements Initializable {

    @FXML
    private TextField Nama;
    @FXML
    private TextField Absen;
    @FXML
    private TextField Alamat;
    @FXML
    private TextField Telp;
    @FXML
    private TextArea TA;
    @FXML
    private Button Proses;
    @FXML
    private Button hapus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonproses(ActionEvent event) {
        String nama=Nama.getText();
        String alamat=Alamat.getText();
        String absen=Absen.getText();
        String telp=Telp.getText();
        TA.setText("Nama : "+nama+"\nAlamat : "+alamat+"\nAbsen : "+absen+"\nNo.telp : "+telp);
    }

    @FXML
    private void buttonhapus(ActionEvent event) {
        Nama.setText("");
        Alamat.setText("");
        Absen.setText("");
        Telp.setText("");
        TA.setText("");
    }
    
}
