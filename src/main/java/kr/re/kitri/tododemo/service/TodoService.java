package kr.re.kitri.tododemo.service;

import kr.re.kitri.tododemo.model.Todo;
import kr.re.kitri.tododemo.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
@Service
public class TodoService {

    // public static final Logger log = LoggerFactory.getLogger(TodoService.class);

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        // 0으로 나누는 에러 (의도적으로)
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 4);
        double result = 3/randomNumber;
        log.debug("서비스메소드 실행.." + result);
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
