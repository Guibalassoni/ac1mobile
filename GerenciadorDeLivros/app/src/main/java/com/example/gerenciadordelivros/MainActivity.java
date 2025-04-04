package com.example.gerenciadordelivros;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private EditText editTitulo, editAutor;
    private Spinner spinnerCategoria;
    private CheckBox checkLeituraConcluida;
    private Button buttonSalvar;
    private RecyclerView recyclerViewLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTitulo = findViewById(R.id.editTitulo);
        editAutor = findViewById(R.id.editAutor);
        spinnerCategoria = findViewById(R.id.spinnerCategoria);
        checkLeituraConcluida = findViewById(R.id.checkLeituraConcluida);
        buttonSalvar = findViewById(R.id.buttonSalvar);
        recyclerViewLivros = findViewById(R.id.recyclerViewLivros);

        // Configuração do Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.categorias_livros, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategoria.setAdapter(adapter);

        // Configuração do RecyclerView
        // ... (Adicione a configuração do RecyclerView aqui)
    }
}