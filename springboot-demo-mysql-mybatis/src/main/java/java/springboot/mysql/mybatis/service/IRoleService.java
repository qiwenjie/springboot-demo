package java.springboot.mysql.mybatis.service;

import springboot.mysql.mybatis.entity.Role;
import springboot.mysql.mybatis.entity.query.RoleQueryBean;

import java.util.List;

public interface IRoleService {

    List<Role> findList(RoleQueryBean roleQueryBean);

}
