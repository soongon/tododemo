package kr.re.kitri.tododemo.controller;

import kr.re.kitri.tododemo.model.Todo;
import kr.re.kitri.tododemo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> todos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/todos/{todoId}")
    public Todo detailTodo(@PathVariable int todoId) {
        return todoService.getTodoDetailById(todoId);
    }

    @PostMapping("/todos")
    public Todo writeTodo(@RequestBody Todo todo) {
        System.out.println(todo);
        return todoService.writeTodo(todo);
    }

}
