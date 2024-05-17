package kr.re.kitri.tododemo.exception;

import kr.re.kitri.tododemo.model.ErrorMsg;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    // ArithmaticException 발생시 처리되는 코드
    @ExceptionHandler(value = ArithmeticException.class)
    public ErrorMsg handleArithmaticException(ArithmeticException e) {
        ErrorMsg msg = new ErrorMsg();
        msg.setErrorCode("001");
        msg.setMessage("0으로 나누셨군요");
        msg.setTechnicalMessage(e.getMessage());
        return msg;
    }

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public ErrorMsg handleBSGException(BadSqlGrammarException e) {
        ErrorMsg msg = new ErrorMsg();
        msg.setErrorCode("002");
        msg.setMessage("데이터베이스에 문제가 있어요. 다시 시도해 보세요");
        msg.setTechnicalMessage(e.getMessage());
        return msg;
    }
}
