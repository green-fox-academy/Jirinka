package com.example.todo.Service;

import com.example.todo.Model.Todo;

import java.util.List;

public interface TodoServiceInt {
    List<Todo> listAll();
    List<Todo> listOfDone(boolean isDone);
}
