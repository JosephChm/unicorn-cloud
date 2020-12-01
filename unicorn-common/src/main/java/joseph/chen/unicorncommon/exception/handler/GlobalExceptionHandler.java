package joseph.chen.unicorncommon.exception.handler;

import joseph.chen.unicorncommon.domain.Result;
import joseph.chen.unicorncommon.exception.CommonException;
import joseph.chen.unicorncommon.utils.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ CommonException.class })
    public Result handleAeException(CommonException e) {
        return ResultUtil.genExceptionResult("system error, error message is：" + e.getMessage());
    }

    @ExceptionHandler({ Exception.class })
    public Result handleException(Exception e) {
        return ResultUtil.genExceptionResult("system error, error message is：" + e.getMessage());
    }

    @ExceptionHandler({ RuntimeException.class })
    public Result handleException(RuntimeException e) {
        return ResultUtil.genExceptionResult("system error, error message is：" + e.getMessage());
    }

}
