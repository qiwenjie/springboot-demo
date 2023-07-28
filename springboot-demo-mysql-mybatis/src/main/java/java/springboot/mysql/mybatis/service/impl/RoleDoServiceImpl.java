package java.springboot.mysql.mybatis.service.impl;

import org.springframework.stereotype.Service;
import springboot.mysql.mybatis.dao.IRoleDao;
import springboot.mysql.mybatis.entity.Role;
import springboot.mysql.mybatis.entity.query.RoleQueryBean;
import springboot.mysql.mybatis.service.IRoleService;

import java.util.List;

@Service
public class RoleDoServiceImpl implements IRoleService {

    /**
     * roleDao.
     */
    private final IRoleDao roleDao;

    /**
     * init.
     *
     * @param roleDao2 role dao
     */
    public RoleDoServiceImpl(final IRoleDao roleDao2) {
        this.roleDao = roleDao2;
    }

    @Override
    public List<Role> findList(RoleQueryBean roleQueryBean) {
        return roleDao.findList(roleQueryBean);
    }
}
