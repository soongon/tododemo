package kr.re.kitri.tododemo.service;

import kr.re.kitri.tododemo.model.Todo;
import kr.re.kitri.tododemo.repository.TodoRepository;
import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TodoServiceTests {

    @Autowired
    private TodoRepository todoRepository;

    // 전체보기 메소드 테스트케이스
    @Test
    public void testGetAllTodos() {
        // 조회해서 결과가 하나이상 조회되면 성공
        List<Todo> todos =  todoRepository.selectAllTodos();
        Assertions.assertFalse(todos.isEmpty());
    }

    // 상세보기 메소드 테스트케이스
    @Test
    public void testDetailTodo() {
        // 5번아이디로 조회시 content가 "음악듣기" 이면 성공
        Todo todo = todoRepository.selectTodoById(5);
        Assertions.assertEquals("음악듣기", todo.getContent());
    }

    // 할일 등록 메소드 테스트케이스
    @Test
    public void testWriteTod() {
        // (450, "강아지 산책", false)
        // 등록 후 450번으로 조회하여 content가 "강아지 산책" 이면 성공
        todoRepository.insertTodo(new Todo(450, "강아지 산책", false));
        Todo todo = todoRepository.selectTodoById(450);
        Assertions.assertEquals("강아지 산책", todo.getContent());
    }
}
