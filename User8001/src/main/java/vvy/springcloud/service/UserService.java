package vvy.springcloud.service;

import org.springframework.stereotype.Service;
import vvy.springcloud.entity.User;

/**
 * @author ArKr
 * @date 2021/10/30 17:16
 * @apiNote
 **/
public interface UserService {
    public int create(User person);
}
