package vvy.springcloud.service.impl;

import org.springframework.stereotype.Service;
import vvy.springcloud.dao.UserDao;
import vvy.springcloud.entity.User;
import vvy.springcloud.service.UserService;

import javax.annotation.Resource;

/**
 * @author ArKr
 * @date 2021/10/30 17:17
 * @apiNote
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public int create(User user) {
        System.out.println("reader to insert  user!!");
        return userDao.create(user);
    }
}
