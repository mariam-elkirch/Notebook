
package com.example.notebook.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.notebook.DataBase.DAOs.NotesDao;
import com.example.notebook.DataBase.Model.Note;


@Database(entities = {Note.class},version = 1,exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {
    private static MyDataBase dataBase;
    private static final String DB_NAME= "NotesDatabase";

    public abstract NotesDao notesDao();

    public MyDataBase(){

    }
    public static MyDataBase getInstance(Context context){
        if(dataBase==null){
            //create database
            dataBase =  Room.databaseBuilder(context,MyDataBase.class,
                    DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }

        return dataBase;
    }
}
