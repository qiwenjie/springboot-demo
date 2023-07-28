package java.springboot.mysql.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import java.springboot.mysql.mybatis.entity.Role;
import java.springboot.mysql.mybatis.entity.query.RoleQueryBean;
import java.util.List;

/**
 * @author qiwenjie
 */
@Mapper
public interface IRoleDao {
    List<Role> findList(RoleQueryBean roleQueryBean);
}
