package com.edu.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.server.pojo.Department;
import com.edu.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lubenjun
 * @since 2024-04-16
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments();

    /**
     * 添加部门
     * @param dep
     * @return
     */
    RespBean addDep(Department dep);
}
