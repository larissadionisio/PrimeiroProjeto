package com.example.alunos.androidtoolbar;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;


import java.util.ArrayList;


public class AddItemsFragment extends Fragment {

    ArrayList<Pessoa> lista = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_add_items_layout,
                container, false);
        return v;
    }
    public void Salvar(View V) {
            MainActivity atividade = (MainActivity) getActivity();
            EditText nome = findViewById(R.id.nome)
            String oNome = nome.getText().toString();
            return;
    }


}
}
