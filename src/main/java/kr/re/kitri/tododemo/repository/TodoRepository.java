package kr.re.kitri.tododemo.repository;

import kr.re.kitri.tododemo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {
    public List<Todo> selectAllTodos() {
        // 투두데이터를 디비에서 가져와서 자바타입으로 변환해서 넘겨준다.
        // List<Todo> 이렇게 넘겨준다.
        List<Todo> todos = List.of(
                new Todo(1, "설겆이 하기", false),
                new Todo(2, "방청소 하기", false),
                new Todo(3, "저녁 하기", false)
        );
        return todos;
    }

    public Todo selectTodoById(String todoId) {
        return new Todo(Long.parseLong(todoId), "음악듣기", true);

    }

    public Todo insertTodo(Todo todo) {
        return todo;

    }
}
