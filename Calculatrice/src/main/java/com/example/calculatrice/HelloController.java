package com.example.calculatrice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class HelloController {


    public TextArea text;
    public float operande = 0;
    public char operateur ;


    public void add(ActionEvent actionEvent) {
        Button a =(Button) actionEvent.getSource();
        if(operande == 0 ){
            float nbr = Float.parseFloat(a.getText());
            operande = nbr ;
        }
        else {
            text.setText(text.getText()+a.getText());
        }

    }

    public void opp(ActionEvent actionEvent) {
        Button a= (Button) actionEvent.getSource();
        String o = new String(text.getText());
        operateur = a.getText().charAt(0);
        text.setText("");
    }

    public void clear(ActionEvent actionEvent) {
        text.setText("");
    }

    public void egale(ActionEvent actionEvent) {
        if (operateur == '+' && operande != 0) {
            operande = operande + Float.parseFloat(text.getText());
            text.setText(String.valueOf(operande));
        } else if (operateur == '-' && operande != 0) {
            operande = operande - Float.parseFloat(text.getText());
            text.setText(String.valueOf(operande));
        } else if (operateur == '*' && operande != 0) {
            operande = operande * Float.parseFloat(text.getText());
            text.setText(String.valueOf(operande));
        } else if (operateur == '/' && operande != 0){
            operande = operande / Float.parseFloat(text.getText());
            text.setText(String.valueOf(operande));
        }
        else {
            System.out.println("error");
        }

    }
}