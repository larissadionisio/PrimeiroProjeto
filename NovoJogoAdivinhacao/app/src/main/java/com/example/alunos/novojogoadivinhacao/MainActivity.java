package com.example.alunos.novojogoadivinhacao;


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
        numero = gera.nextInt(100) + 1;
    }
    public void jogo(View v){
        EditText userInput = findViewById(R.id.EditText);
        String  n = userInput.getText().toString();
        int nume = Integer.parseInt(n);

        TextView acertou = (TextView) findViewById(R.id.acertou);
        TextView errou  = (TextView) findViewById(R.id.errou);
        TextView resul  = (TextView) findViewById(R.id.resul);


        while (numero != nume) {
            if (numero > nume) {
                 acertou.setText("O número é maior!");
            }else if {
                acertou.setText("O número é menor!");
            }
         }

         resul.setText("Acertou! Fim de jogo");
         tent=0;

    }
}
