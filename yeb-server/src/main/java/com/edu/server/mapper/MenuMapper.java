package com.edu.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lubenjun
 * @since 2024-03-30
 */
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 根据用户id查询菜单列表
     * @param id
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);
    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
