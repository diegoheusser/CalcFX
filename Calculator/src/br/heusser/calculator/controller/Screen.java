package br.heusser.calculator.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Diego Heusser
 */
public class Screen implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button dot;
    @FXML
    private Button zero;
    @FXML
    private Button equal;
    @FXML
    private Button plus;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button minus;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button multiplication;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button division;
    @FXML
    private TextArea textArea;

    private String old, operator, text;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        old = "";
        operator = "";
        text = "";
        zero.setOnAction((ActionEvent event) -> {
            text += "0";
            textArea.setText(text);
        });
        one.setOnAction((ActionEvent event) -> {
            text += "1";
            textArea.setText(text);
        });
        two.setOnAction((ActionEvent event) -> {
            text += "2";
            textArea.setText(text);
        });
        three.setOnAction((ActionEvent event) -> {
            text += "3";
            textArea.setText(text);
        });
        four.setOnAction((ActionEvent event) -> {
            text += "4";
            textArea.setText(text);
        });
        five.setOnAction((ActionEvent event) -> {
            text += "5";
            textArea.setText(text);
        });
        six.setOnAction((ActionEvent event) -> {
            text += "6";
            textArea.setText(text);
        });
        seven.setOnAction((ActionEvent event) -> {
            text += "7";
            textArea.setText(text);
        });
        eight.setOnAction((ActionEvent event) -> {
            text += "8";
            textArea.setText(text);
        });
        nine.setOnAction((ActionEvent event) -> {
            text += "9";
            textArea.setText(text);
        });
        dot.setOnAction((ActionEvent event) -> {
            if (text.length() > 0 || !text.contains(".")) {
                text += ".";
                textArea.setText(text);
            }
        });
        plus.setOnAction((ActionEvent event) -> {
            old = text;
            text = "";
            operator = "+";
        });
        minus.setOnAction((ActionEvent event) -> {
            old = text;
            text = "";
            operator = "-";
        });
        multiplication.setOnAction((ActionEvent event) -> {
            old = text;
            text = "";
            operator = "x";
        });
        division.setOnAction((ActionEvent event) -> {
            old = text;
            text = "";
            operator = "/";
        });
        equal.setOnAction((ActionEvent event) -> {
            double result = 0;
            switch (operator) {
                case "+": {
                    result = Double.parseDouble(old);
                    result = result + Double.parseDouble(text);
                    break;
                }
                case "-": {
                    result = Double.parseDouble(old);
                    result = result - Double.parseDouble(text);
                    break;
                }
                case "*": {
                    result = Double.parseDouble(old);
                    result = result * Double.parseDouble(text);
                    break;
                }
                case "/": {
                    result = Double.parseDouble(old);
                    result = result / Double.parseDouble(text);
                    break;
                }
                default: {
                    break;
                }
            }
            text = String.valueOf(result);
            old = text;
            textArea.setText(text);
        });

    }
}
