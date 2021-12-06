package vvy.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ArKr
 * @date 2021/10/30 16:25
 * @apiNote
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result(int code,String message){
        this(code,message,null);
    }
}
