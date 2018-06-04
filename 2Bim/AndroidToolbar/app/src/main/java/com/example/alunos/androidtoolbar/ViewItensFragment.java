package com.example.alunos.androidtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import android.support.v4.app.Fragment;

public class ViewItensFragment extends Fragment {
    MainActivity atividade = (MainActivity) getActivity();

    ListView listView = findViewById(R.id.listView);

    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();

        try {
        ArrayList<Pessoa> lista = bundle.getParcelableArrayList(
                "contatos");
        PessoaAdapter adapter = new PessoaAdapter(
                fragment_view_itens_layout.this, lista);
        listView.setAdapter(adapter);
    } catch (Exception e) {
        Log.d(e.getClass().toString(), e.getMessage());
    }
}
