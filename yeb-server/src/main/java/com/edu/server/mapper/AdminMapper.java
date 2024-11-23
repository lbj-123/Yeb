package com.edu.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.server.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lubenjun
 * @since 2024-03-30
 */
public interface AdminMapper extends BaseMapper<Admin> {


    /**
     * 获取所有操作员
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
