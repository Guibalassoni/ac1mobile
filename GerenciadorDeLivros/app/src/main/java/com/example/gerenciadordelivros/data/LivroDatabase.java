package com.example.gerenciadordelivros.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Livro.class}, version = 1)
public abstract class LivroDatabase extends RoomDatabase {

    private static LivroDatabase INSTANCE;

    public abstract LivroDao livroDao();

    public static LivroDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (LivroDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    LivroDatabase.class, "livro_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}