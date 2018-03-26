package com.example.alunos.listadinamica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

        EditText nome =  findViewById(R.id.nome);
        String oNome = nome.getText().toString();
        EditText telefone = findViewById(R.id.telefone);
        String oTelefone = telefone.getText().toString();
    }

    public void mostrarLista(View v) {
        lista.add(new Pessoa("nome", "telefone", R.mipmap.ic_launcher_round));
        Intent it = new Intent(this, mostrarListaDinamica.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("contatos", lista);
        it.putExtras(bundle);
        startActivity(it);
    }
}
