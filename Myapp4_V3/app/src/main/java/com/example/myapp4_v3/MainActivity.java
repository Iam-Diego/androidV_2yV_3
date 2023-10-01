package com.example.myapp4_v3;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1, editText2, editText3;
    private TextView textViewMayor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        textViewMayor = findViewById(R.id.textViewMayor);

        // Configurar el botón para escuchar los clics
        findViewById(R.id.buttonCalcular).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == findViewById(R.id.buttonCalcular)) {
            calcularMayor();
        }
    }
    private void calcularMayor() {
        int numero1 = Integer.parseInt(editText1.getText().toString());
        int numero2 = Integer.parseInt(editText2.getText().toString());
        int numero3 = Integer.parseInt(editText3.getText().toString());

        int mayor = Math.max(numero1, Math.max(numero2, numero3));

        textViewMayor.setText("El número mayor es: " + mayor);
    }
}