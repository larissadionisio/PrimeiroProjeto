package com.example.alunos.linearlayoutviaapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //CRIA LAYOUT
        LinearLayout layout = new LinearLayout(this);
        layout.setPadding(10, 10, 10, 10);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        layout.setPadding(10, 10, 10, 10); //PIXELS

        TextView nome = new TextView(this);
        nome.setText("Nome:");
        nome.setLayoutParams(new LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT
        ));
        layout.addView(nome);

        EditText tnome = new EditText(this);
        tnome.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT
        ));
        layout.addView(tnome);
        //FOCUS
        tnome.requestFocus();
        EditText senha = new EditText(this);
        senha.setText("Senha:");
        senha.setLayoutParams(new LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT
        ));
        layout.addView(senha);
        EditText tsenha = new EditText(this);
        tsenha.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT
        ));
        layout.addView(tsenha);

        // BOTÃO ALINHADO A DIREITA
        Button ok = new Button(this);
        ok.setLayoutParams(new LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT
        ));
        //ok.setGravity(Gravity.RIGHT);
        ok.setText("OK");
        layout.addView(ok);

        // INFORMA O LAYOUT
        setContentView(layout);

    }
}
