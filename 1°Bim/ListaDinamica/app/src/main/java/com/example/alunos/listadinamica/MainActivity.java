package com.example.alunos.listadinamica;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alunos.listadinamica.model.Pessoa;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pessoa> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void salvar(View v) {
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        EditText nome =  findViewById(R.id.nome);
        String oNome = nome.getText().toString();
        if(oNome.matches("")) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "É preciso digitar as informações...", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        EditText telefone = findViewById(R.id.telefone);
        String oTelefone = telefone.getText().toString();
        if(oTelefone.matches("")) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "É preciso digitar as informações...", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        SharedPreferences.Editor editor = arquivo.edit();
                editor.putString("nome",oNome);
                editor.putString("telefone", oTelefone);
                editor.commit();
        lista.add(new Pessoa(oNome, oTelefone,
                R.mipmap.ic_launcher_round));
    }

    public void mostrarLista(View v) {
        Intent it = new Intent(this, mostrarListaDinamica.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("contatos", lista);
        it.putExtras(bundle);
        startActivity(it);



    }
}
