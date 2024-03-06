package view;

import service.TodolistService;
import util.InputUtil;

public class TodolistView {

    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    // show todolist
    public void showTodolist(){
        while (true) {
            todolistService.showTodolist();

            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");
            if (input.equals("1")) {
                addTodolist();
            } else if (input.equals("2")) {
                removeTodolist();
            } else if (input.equals("x")) {
                System.out.println("Terima kasih menggunakan aplikasi kami");
                break;
            } else {
                System.out.println("Masukkan inputan yang benar!");
            }

        }
    }

    // add todolist
    public void addTodolist(){

    }

    // remove
    public void removeTodolist(){

    }

}
