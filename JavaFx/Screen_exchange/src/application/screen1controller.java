package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class screen1controller implements Initializable {
	@FXML Label lblText, lblSum;
	@FXML Button btn1,btn2,btnCal;
	@FXML TextField txtper,txtprice;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void btn1Action (ActionEvent event) {
		try {
			Stage stage =(Stage) btn1.getScene().getWindow();
			Parent root = FXMLLoader.load(getClass().getResource("scrn2.fxml"));
			stage.setTitle("두번째 화면");
			stage.setScene(new Scene(root, 600,400));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
			e.getCause();
		}
	}
	public void btn2Action (ActionEvent event) {
		Stage stage =(Stage) btn2.getScene().getWindow();
		stage.close();
	}
	
	public void btnCalAction(ActionEvent event) {
		
	}
}
