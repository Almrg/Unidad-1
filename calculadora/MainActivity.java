package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtVisor;

    private int numero_a = 0;
    private int resultado = 0;
    private String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtVisor = (EditText)findViewById(R.id.visor);
    }
    private void EscribeNumero(int numero){
        //obtener el text del visor
        String valor_visor = txtVisor.getText().toString();
        //Concatenamos el texto con el numero que ingresamos
        valor_visor = valor_visor + numero;
        //Mostrar el texto concatenado
        txtVisor.setText(valor_visor);
    }

    private void AlmacenaOperacion(String operacion){
    this.numero_a= Integer.parseInt(txtVisor.getText().toString());
    this.operacion= operacion;
    this.txtVisor.setText("");
    }

    public void click_btnNumero1(View v){
        EscribeNumero(1);
    }

    public void click_btnNumero2(View v){
        EscribeNumero(2);
    }

    public void click_btnNumero3(View v){
        EscribeNumero(3);
    }
    public void click_btnNumero4(View v) {
        EscribeNumero(4);
    }
    public void click_btnNumero5(View v) {
        EscribeNumero(5);
    }
    public void click_btnNumero6(View v) {
        EscribeNumero(6);
    }
    public void click_btnNumero7(View v) {
        EscribeNumero(7);
    }
    public void click_btnNumero8(View v) {
        EscribeNumero(8);
    }
    public void click_btnNumero9(View v) {
        EscribeNumero(9);
    }
    public void click_btnNumero0(View v) {
        EscribeNumero(0);
    }
    public void click_btnSumar(View v) {
        AlmacenaOperacion("+");
    }

    public void click_btnIgual(View v){
    int numero_b = Integer.parseInt(this.txtVisor.getText().toString());
    if(this.operacion.equals("+")){
        this.resultado = this.numero_a + numero_b;
    }
    this.txtVisor.setText(this.resultado);
}
 }