package com.example.todo.Controller;

import com.example.todo.Repository.TodoRepository;
import com.example.todo.Service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

    public final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isActive){
        if (isActive == null){
        model.addAttribute("list", todoService.listAll());}
        else model.addAttribute("list", todoService.listOfDone(!isActive));
        return "todosList";
    }


}
