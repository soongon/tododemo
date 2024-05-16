package kr.re.kitri.tododemo.repository;

import kr.re.kitri.tododemo.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TodoRepository {
    List<Todo> selectAllTodos();
    Todo selectTodoById(String todoId);
    Todo insertTodo(Todo todo);
}
