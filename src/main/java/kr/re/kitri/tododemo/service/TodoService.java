package kr.re.kitri.tododemo.service;

import kr.re.kitri.tododemo.model.Todo;
import kr.re.kitri.tododemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.selectAllTodos();
    }

    public Todo getTodoDetailById(int todoId) {
        return todoRepository.selectTodoById(todoId);
    }

    public Todo writeTodo(Todo todo) {
        todoRepository.insertTodo(todo);
        return todo;
    }
}
