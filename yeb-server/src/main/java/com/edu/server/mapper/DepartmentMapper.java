package com.edu.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.server.pojo.Department;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lubenjun
 * @since 2024-04-16
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments(Integer parentId);

    /**
     * 添加部门
     * @param dep
     * @return
     */
    void addDep(Department dep);
}
