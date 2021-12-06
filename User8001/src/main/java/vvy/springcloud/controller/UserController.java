package vvy.springcloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import vvy.springcloud.entity.Result;
import vvy.springcloud.entity.User;
import vvy.springcloud.service.UserService;

import javax.annotation.Resource;

/**
 * @author ArKr
 * @date 2021/10/30 16:58
 * @apiNote
 **/
@RestController
@Api("User控制类")
public class UserController {


    @Resource
    UserService userService;

    @PostMapping("create")
    @ApiOperation(value = "desc of method", notes = "")
    public Result create(User user){
        System.out.println(user);
        int result = userService.create(user);
        return result > 0 ?
                new Result(200,"插入成功!",user.getId())
                : new Result(500,"插入失败");
    }

}
