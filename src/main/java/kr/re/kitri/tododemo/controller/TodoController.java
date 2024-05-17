package kr.re.kitri.tododemo.controller;

import kr.re.kitri.tododemo.model.Todo;
import kr.re.kitri.tododemo.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class TodoController {

    // public static final Logger log = LoggerFactory.getLogger(TodoController.class);

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
        return todoService.writeTodo(todo);
    }

}
