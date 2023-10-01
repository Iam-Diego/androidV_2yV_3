package com.example.myapp4_v2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private TextView textViewMayor;
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        textViewMayor = findViewById(R.id.textViewMayor);
        buttonCalcular = findViewById(R.id.buttonCalcular);

        editText1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    editText2.requestFocus();
                    return true;
                }
                return false;
            }
        });

        editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    editText3.requestFocus();
                    return true;
                }
                return false;
            }
        });

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNum1 = editText1.getText().toString();
                String strNum2 = editText2.getText().toString();
                String strNum3 = editText3.getText().toString();

                int num1 = Integer.parseInt(strNum1);
                int num2 = Integer.parseInt(strNum2);
                int num3 = Integer.parseInt(strNum3);

                int numeroMayor = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

                textViewMayor.setText("El número mayor es: " + numeroMayor);
            }
        });
    }
}

