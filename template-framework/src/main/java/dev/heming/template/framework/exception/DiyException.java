package dev.heming.template.framework.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @Description 自定义业务异常
 * @Author Bess Croft
 * @Date 2024/1/20 20:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DiyException extends RuntimeException{

    private static final Long serialVersionUID = 1L;

    /** 错误码 */
    private Integer code;

    /** 错误提示 */
    private String message;

    public DiyException(String message) {
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
        this.message = message;
    }

    public DiyException(String message, Throwable cause) {
        super(message, cause);
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
        this.message = message;
    }

}
