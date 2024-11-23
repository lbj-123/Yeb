package com.edu.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.server.pojo.MenuRole;
import com.edu.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lubenjun
 * @since 2024-04-18
 */
public interface IMenuRoleService extends IService<MenuRole> {
    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
