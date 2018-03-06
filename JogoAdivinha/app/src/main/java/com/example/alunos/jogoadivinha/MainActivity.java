package com.example.alunos.jogoadivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int numero;
    int tent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sorteia();
    }
    public void sorteia(){
        Random gera = new Random();
        numero = gera.nextInt(10) + 1;
    }
    public void jogo(View v){
        EditText userInput = findViewById(R.id.EditText);
        String  n = userInput.getText().toString();
        int nume = Integer.parseInt(n);

        TextView acertou = (TextView) findViewById(R.id.acertou);
        TextView errou  = (TextView) findViewById(R.id.errou);

        if( numero == nume) {
            acertou.setText(getResources(). getString(R.string.lblAcertou));
            userInput.setText("");
        }
        else if (tent == 2) {
            acertou.setText(getResources(). getString(R.string.lblFim));
            sorteia();
            tent = 0;
            userInput.setText("");
        }
        else {
            acertou.setText(getResources(). getString(R.string.lblErrou));
            userInput.setText("");
            tent++;
        }

    }
}