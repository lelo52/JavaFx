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
import javafx.stage.Stage;

public class screen2controller implements Initializable {
	@FXML Label lblText;
	@FXML Button btn11,btn22;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void btn1Action (ActionEvent event) {
	try {
		Stage stage =(Stage) btn11.getScene().getWindow(); 
		Parent root = FXMLLoader.load(getClass().getResource("scrn1.fxml"));
		stage.setTitle("첫번째 화면");
		stage.setScene(new Scene(root, 600,400));
		stage.show();
		}catch (Exception e) {
			e.printStackTrace();
			e.getCause();
		}
	}

	public void btn2Action (ActionEvent event) {
		Stage stage =(Stage) btn22.getScene().getWindow();
		stage.close();
	}
}
