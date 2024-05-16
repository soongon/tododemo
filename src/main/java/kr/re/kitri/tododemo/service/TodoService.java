package kr.re.kitri.tododemo.service;

import kr.re.kitri.tododemo.model.Todo;
import kr.re.kitri.tododemo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public String getAllTodos() {
        return todoRepository.selectAllTodos();
    }

    public String getTodoDetailById(String todoId) {
        return todoRepository.selectTodoById(todoId);
    }

    public String writeTodo(Todo todo) {
        return todoRepository.insertTodo(todo);
    }
}
