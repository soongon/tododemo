package kr.re.kitri.tododemo.controller;

import kr.re.kitri.tododemo.model.Todo;
import kr.re.kitri.tododemo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public String todos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/todos/{todoId}")
    public String detailTodo(@PathVariable String todoId) {
        return todoService.getTodoDetailById(todoId);
    }

    @PostMapping("/todos")
    public String writeTodo(@RequestBody Todo todo) {
        return todoService.writeTodo(todo);
    }

}
