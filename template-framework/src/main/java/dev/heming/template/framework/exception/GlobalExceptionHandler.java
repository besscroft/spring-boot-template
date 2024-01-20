package dev.heming.template.framework.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 全局异常处理
 * @Author Bess Croft
 * @Date 2024/1/20 19:59
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 自定义异常 Gai4jException
     */
    @ResponseBody
    @ExceptionHandler(value = DiyException.class)
    public ResponseEntity<?> diyFileExceptionHandler(DiyException ex) {
        log.info("自定义异常.[异常原因={}]", ex.getMessage(), ex);
        return ResponseEntity.status(ex.getCode()).body(ex.getMessage());
    }

    /**
     * 全局异常拦截 handleException
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception ex) {
        log.error("全局异常信息.[异常原因={}]", ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body("系统异常，请联系管理员！");
    }

}
