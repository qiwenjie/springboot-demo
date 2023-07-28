package java.springboot.mysql.mybatis.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.mysql.mybatis.entity.Role;
import springboot.mysql.mybatis.entity.query.RoleQueryBean;
import springboot.mysql.mybatis.entity.response.ResponseResult;
import springboot.mysql.mybatis.service.IRoleService;

import java.util.List;

/**
 * @author qiwenjie
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    /**
     * @return user list
     */
    @ApiOperation("Query Role List")
    @GetMapping("list")
    public ResponseResult<List<Role>> list(RoleQueryBean roleQueryBean) {
        return ResponseResult.success(roleService.findList(roleQueryBean));
    }
}
