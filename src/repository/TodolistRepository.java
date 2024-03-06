package repository;

import entity.Todolist;

public interface TodolistRepository {

    // mengambil data
    Todolist[] getAll();

    // menambah data
    void add(Todolist todolist);

    // menghapus data
    void remove(Integer number);


}
