package com.edu.server.controller;


import com.edu.server.pojo.Admin;
import com.edu.server.pojo.RespBean;
import com.edu.server.pojo.Role;
import com.edu.server.service.IAdminService;
import com.edu.server.service.IRoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lubenjun
 * @since 2024-03-30
 */
@RestController
@RequestMapping("/system/admin")
public class AdminController {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IAdminService adminService;
    @Autowired
    private IRoleService roleService;

    @ApiOperation(value = "获取所有操作员")
    @GetMapping("/")
    public List<Admin> getAllAdmins(String keywords){
        return adminService.getAllAdmins(keywords);
    }

    @ApiOperation(value = "注册操作员")
    @PostMapping("/register")
    public RespBean addAdmin(@RequestBody Admin admin){
//        admin.setId(UUID.randomUUID());
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));//密码加密
        if(adminService.save(admin)){
            return RespBean.success("成功创建用户");
        }
        return RespBean.error("创建用户失败");
    }


    @ApiOperation(value = "更新操作员")
    @PutMapping("/")
    public RespBean updateAdmin(@RequestBody Admin admin){
        if(adminService.updateById(admin)){
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败！");
    }
    @ApiOperation(value = "删除操作员")
    @DeleteMapping("/{id}")
    public RespBean deleteAdmin(@PathVariable Integer id){
        if(adminService.removeById(id)){
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @ApiOperation(value = "获取所有角色")
    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleService.list();
    }

    @ApiOperation(value = "更新操作员角色")
    @PutMapping("/role")
    public  RespBean updateAdminRole(Integer adminId,Integer[] rids){
        return adminService.updateAdminRole(adminId,rids);
    }
}
