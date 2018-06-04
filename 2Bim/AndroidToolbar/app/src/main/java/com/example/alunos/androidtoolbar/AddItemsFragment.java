package com.example.alunos.androidtoolbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class AddItemsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment_add_items_layout,
                    container, false);
            return v;

    }

    public void salvar(View v) {
        EditText nome = findViewById(R.id.nome);
        String oNome =  nome.getText().toString();
    }
    lista.add(oNome)

}
