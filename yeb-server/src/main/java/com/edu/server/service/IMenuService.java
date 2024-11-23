package com.edu.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lubenjun
 * @since 2024-03-30
 */
public interface IMenuService extends IService<Menu> {
    /**
     * 根据用户id查询菜单列表
     */
    List<Menu> getMenusByAdminId();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
