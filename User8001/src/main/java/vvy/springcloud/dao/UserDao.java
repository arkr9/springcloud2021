package vvy.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import vvy.springcloud.entity.User;

/**
 * @author ArKr
 * @date 2021/10/30 17:01
 * @apiNote
 **/
@Mapper
public interface UserDao {

    public int create(User person);

}
