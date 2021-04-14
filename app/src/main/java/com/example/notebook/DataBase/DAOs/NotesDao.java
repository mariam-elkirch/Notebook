
package com.example.notebook.DataBase.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.notebook.DataBase.Model.Note;

import java.util.List;


@Dao
public interface NotesDao {

    @Insert
    void addNote(Note note);

    @Update
    void updateNote(Note note);

    @Delete
    void deleteNote(Note note);

    @Query("delete from Note where id =:id ")
    void deleteNote(int id);

    @Query("select * from Note where title = :title")
    List<Note> searchNoteByTitle(String title);

    @Query("select *  from Note")
    List<Note> getAllNotes();
}
