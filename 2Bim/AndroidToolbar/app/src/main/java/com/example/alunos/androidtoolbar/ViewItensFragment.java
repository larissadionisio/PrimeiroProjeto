package com.example.alunos.androidtoolbar;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewItensFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.fragment_view_items_layout);
    }

    ListView listView = findViewById(R.id.lista);

    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();

        try

    {
        ArrayList<Pessoa> lista = bundle.getParcelableArrayList(
                "lista");
    }

    public void mostrarLista(View v) {
        Intent it = new Intent(this, ViewItensFragment);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("contatos", lista);
        it.putExtras(bundle);
        startActivity(it);



    }
}
