package java.springboot.mysql.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import java.springboot.mysql.mybatis.entity.User;
import java.springboot.mysql.mybatis.entity.query.UserQueryBean;
import java.util.List;

/**
 * @author qiwenjie
 */
@Mapper
public interface IUserDao {

    List<User> findList(UserQueryBean userQueryBean);

    User findById(Long id);

    int deleteById(Long id);

    int deleteByIds(Long[] ids);

    int update(User user);

    int save(User user);

    int updatePassword(User user);
}
