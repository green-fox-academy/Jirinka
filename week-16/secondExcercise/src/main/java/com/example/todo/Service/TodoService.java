package com.example.todo.Service;

import com.example.todo.Model.Todo;
import com.example.todo.Repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TodoService implements TodoServiceInt{
    TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listAll(){
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> listOfDone(boolean IsDone) {
        return todoRepository.findAll().stream().filter(done -> done.isDone()==IsDone).collect(Collectors.toList());
    }

}
