package com.example.gerenciadordelivros.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "livros")
public class Livro {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "titulo")
    public String titulo;

    @ColumnInfo(name = "autor")
    public String autor;

    @ColumnInfo(name = "categoria")
    public String categoria;

    @ColumnInfo(name = "leitura_concluida")
    public boolean leituraConcluida;

    // Construtores
    public Livro(String titulo, String autor, String categoria, boolean leituraConcluida) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.leituraConcluida = leituraConcluida;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isLeituraConcluida() {
        return leituraConcluida;
    }

    public void setLeituraConcluida(boolean leituraConcluida) {
        this.leituraConcluida = leituraConcluida;
    }
}