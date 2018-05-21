package com.example.alunos.tablelayoutviaapi;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle icile) {
        super.onCreate(icile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //CRIA LAYOUT
        TableLayout tabela = new TableLayout(this);
        tabela.setPadding(10, 10, 10, 10);
        tabela.setLayoutParams(new LayoutParams(
                        LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

        // EXPANDE A COLUNA 1
        TableRow linha1 = new TableRow(this);
        TextView nome = new TextView(this);
        nome.setText("Nome:");
        linha1.addView(nome);
        EditText tnome = new EditText(this);
        // FOCUS NO CAMPO NOME
        tnome.requestFocus();
        linha1.addView(tnome);

        //LINHA 2
        TableRow linha2 = new TableRow(this);
        TextView senha = new TextView(this);
        nome.setText("Senha:");
        linha2.addView(senha);
        EditText tsenha = new EditText(this);
        // FOCUS NO CAMPO NOME
        tsenha.setTransformationMethod(
                new PasswordTransformationMethod());
        linha2.addView(tsenha);

        // LINHA 3
        TableRow linha3 = new TableRow(this);
        linha3.setGravity(Gravity.RIGHT);

        // BOTÃO ALINHADO A DIREITA
        Button ok = new Button(this);
        ok.setText("Login");
        linha3.addView(ok);
        // ADICIONA AS LINHAS
        tabela.addView(linha1);
        tabela.addView(linha2);
        tabela.addView(linha3);

        // INFORMA O LAYOUT
        setContentView(tabela);

    }
}
