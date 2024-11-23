package com.edu.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.server.pojo.AdminRole;
import com.edu.server.pojo.RespBean;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lubenjun
 * @since 2024-04-24
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     * @return
     */
    Integer updateAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
