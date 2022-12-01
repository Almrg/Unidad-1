package com.example.examendebasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText d1,d2,d3;
    Button btnSumar;
    TextView r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d1=(EditText)findViewById(R.id.v1);
        d2=(EditText)findViewById(R.id.v2);
        r=(TextView)findViewById(R.id.resultado);
        btnSumar=(Button)findViewById(R.id.bt1);
        btnSumar.setOnClickListener(this);

        //d1 = findViewById(R.id.v1);
        //d2 = findViewById(R.id.v2);
        //d3 = findViewById(R.id.resultado);
    }

     //public void altas(View view){
      //  AdminSQLiteOpenHelper admin = new adminSQLiteOpenHelper(this, "administracion", null, 1);
        // SQLiteDatabase bd = admin.getWritableDatabase();
       //  String u= d1.getText().toString();
       //  String d= d2.getText().toString();
      //   String r= d3.getText().toString();


       // ContentValues registro = new ContentValues();
        //registro.put("Valor1", u);
       // registro.put("Valor2",d );
      //  registro.put("registro",r);



   // }

    @Override
    public void onClick(View view) {
        int valor1= Integer.parseInt(d1.getText().toString());
        int valor2= Integer.parseInt(d2.getText().toString());
        int s = valor1 + valor2;
        r.setText(s+"");

    }

}