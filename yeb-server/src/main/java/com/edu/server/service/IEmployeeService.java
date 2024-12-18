package com.edu.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.server.pojo.Employee;
import com.edu.server.pojo.RespBean;
import com.edu.server.pojo.RespPageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lubenjun
 * @since 2024-04-28
 */
public interface IEmployeeService extends IService<Employee> {

    /**
     * 获取员工(分页)
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);

    /**
     * 获取工号
     * @return
     */
    RespBean maxWorkID();

    /**
     * 添加员工
     * @param employee
     * @return
     */
    RespBean addEmp(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    List<Employee> getEmployee(Integer id);
}
