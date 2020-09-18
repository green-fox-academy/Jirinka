package com.example.todo.Controller;

import com.example.todo.Model.Todo;
import com.example.todo.Repository.TodoRepository;
import com.example.todo.Service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;

@Controller
@RequestMapping("/todo")
public class TodoController {

    public final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        if (isActive == null) {
            model.addAttribute("list", todoService.listAll());
        } else model.addAttribute("list", todoService.listOfDone(!isActive));
        return "todosList";
    }

    @GetMapping("/add")
    public String addNew() {
        return "add-new";
    }

    @PostMapping("/add")
    public String addNewPost(@ModelAttribute(value = "title") String title) {
        todoService.addNew(new Todo(title));
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/delete")
        public String deletePost(@PathVariable long id){
            todoService.deleteTodo(id);
            return "redirect:/todo/list";
    }
    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable long id, Model model){
        model.addAttribute("todo", todoService.getById(id));
        return "update-page";
    }
    @PostMapping("/{id}/edit")
    public String editPost(@ModelAttribute Todo todo){
        todoService.updateTodo(todo);
        return "redirect:/todo/list";
    }


}
