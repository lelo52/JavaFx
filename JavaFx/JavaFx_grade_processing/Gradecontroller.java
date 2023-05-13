package application;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Gradecontroller implements Initializable {
	@FXML Button btnStart1,btnStart2;
	@FXML TextField txtName,txtKor,txtEng;
	@FXML Label lblAvg, lblSum;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	public void btnStart1Action (ActionEvent event) {
		int tmp =  Integer.parseInt(txtKor.getText());
		int cnt =  Integer.parseInt(txtEng.getText());
		GradeModel model = new GradeModel();
		int tmpsum = model.gradeSum(tmp, cnt);
	
		lblSum.setText(String.valueOf(tmpsum));
		
	}
	public void btnStart2Action (ActionEvent event) {
		int tmp =  Integer.parseInt(txtKor.getText());
		int cnt =  Integer.parseInt(txtEng.getText());
		GradeModel model = new GradeModel();
		double tmpAvg = model.gradeAvg(tmp, cnt);
		
		lblAvg.setText(String.valueOf(tmpAvg));
	}
	
}
