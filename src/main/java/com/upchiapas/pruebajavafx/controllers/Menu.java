package com.upchiapas.pruebajavafx.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.util.ArrayList;
public class Menu {
    ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

    @FXML
    private Button btn_guardarNumero;

    @FXML
    private Button btn_salir;

    @FXML
    private Button btn_sumar;

    @FXML
    private Label lbl_iniciarSesion;

    @FXML
    private TextField txt_numero;

    @FXML
    private TextArea txt_impresion;
    @FXML
    void guardarNumeroClicked(MouseEvent event) {

        int numero;
        numero= Integer.parseInt(txt_numero.getText());
        listaNumeros.add(numero);
        txt_impresion.appendText(String.valueOf(numero)+"\n");
    }
    @FXML
    void hacerSumaClicked(MouseEvent event) {
        int suma=0;
        txt_impresion.setText("");
        for (Integer numero : listaNumeros){
            suma+= numero;
        }
        txt_impresion.appendText(String.valueOf(suma)+"\n");

    }
}
