package com.vvy.springcloud.com.vvy.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ArKr
 * @date 2021/10/20 22:56
 * @apiNote 通用返回类
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private String code;
    private String message;
    private T data;

    public CommonResult(String code,String message){
        this(code,message,null);
    }

}
