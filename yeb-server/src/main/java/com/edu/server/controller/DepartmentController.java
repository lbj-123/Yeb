package com.edu.server.controller;


import com.edu.server.pojo.Department;
import com.edu.server.pojo.RespBean;
import com.edu.server.service.IDepartmentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lubenjun
 * @since 2024-04-16
 */
@RestController
@RequestMapping("/system/basic/department")
public class DepartmentController {
      @Autowired
      private IDepartmentService departmentService;

      @ApiOperation(value = "获取所有部门")
      @GetMapping("/")
      public List<Department>getAllDepartments(){
          return departmentService.getAllDepartments();
      }

      @ApiOperation(value = "添加部门")
      @PostMapping("/")
      public RespBean addDep(@RequestBody Department dep){
            return departmentService.addDep(dep);
      }
}
