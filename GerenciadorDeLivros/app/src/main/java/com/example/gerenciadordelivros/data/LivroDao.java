package com.example.gerenciadordelivros.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface LivroDao {

    @Insert
    void insert(Livro livro);

    @Update
    void update(Livro livro);

    @Delete
    void delete(Livro livro);

    @Query("SELECT * FROM livros")
    List<Livro> getAll();
}