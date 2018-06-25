package com.example.alunos.fakeuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nome;
    private TextView sobrenome;
    private TextView email;
    private TextView endereco;
    private TextView cidade;
    private TextView estado;
    private TextView username;
    private TextView senha;
    private TextView nascimento;
    private TextView telefone;
    private ImageView foto;
    private ProgressBar load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetJson download = new GetJson();

        load = (ProgressBar) findViewById(R.id.simpleṔrogressBar);

        nome = (TextView) findViewById(R.id.nome);
        sobrenome = (TextView) findViewById(R.id.sobrenome);
        email = (TextView) findViewById(R.id.email);
        endereco = (TextView) findViewById(R.id.endereco);
        cidade = (TextView) findViewById(R.id.cidade);
        estado = (TextView) findViewById(R.id.estado);
        username = (TextView) findViewById(R.id.username);
        senha = (TextView) findViewById(R.id.senha);
        nascimento = (TextView) findViewById(R.id.nascimento);
        telefone = (TextView) findViewById(R.id.telefone);
        foto = (ImageView) findViewById(R.id.ImageView);

     


    }
}
