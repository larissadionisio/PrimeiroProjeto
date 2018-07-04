package com.example.alunos.fakeuser;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        foto = (ImageView) findViewById(R.id.imageView);


        //Chama Async Task
        download.execute();
    }

    private class GetJson extends AsyncTask<Void, Void, FakeUser> {

        @Override
        protected void onPreExecute() {
            load.setVisibility(View.VISIBLE);
        }

        @Override
        protected FakeUser doInBackground(Void, Void, FakeUser) {
            Utils util = new Utils();

            return util.getInformacao("https://randomuser.me/api/0.7");
         }

        @Override
        protected void onPostExecute(FakeUser pessoa) {
            String strNome = pessoa.getNome().substring(0, 1).toUpperCase()
                    + pessoa.getNome().substring(1);
            nome.setText(strNome);
             String strSobrenome = pessoa.getSobrenome().substring(0, 1).toUpperCase()
                    + pessoa.getSobrenome().substring(1);
            sobrenome.setText(strSobrenome);
            email.setText(pessoa.getEmail());
            endereco.setText(pessoa.getEndereco);
         String strCidade = pessoa.getCidade().substring(0, 1).toUpperCase()
                    + pessoa.getCidade().substring(1);
         cidade.setText(strCidade);
         estado.setText(pessoa.getEstado());
         username.setText(pessoa.getUsername());
         senha.setText(pessoa.getSenha());
         nascimento.setText(pessoa.getNascimento());
         telefone.setText(pessoa.getTelefone());
         foto.setImageBitmap(pessoa.getFoto());
         load.setVisibility(View.GONE);
        }
    }
}
