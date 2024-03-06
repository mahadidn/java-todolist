package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {

    public static void main(String[] args) {
        testAddTodolist();

    }

    public static void testShowTodolist(){

        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();

        todolistRepository.data[0] = new Todolist("Belajar java dasar");
        todolistRepository.data[1] = new Todolist("Belajar java oop");
        todolistRepository.data[2] = new Todolist("Belajar java standard classes");

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showTodolist();

    }

    public static void testAddTodolist(){

        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Standard Classes");

        todolistService.showTodolist();

    }

}
