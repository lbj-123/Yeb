package com.edu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author lubenjun
 * @since 2024-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_admin")
@ApiModel(value="Admin对象", description="")
public class Admin implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "姓名")
    @TableField(value = "name")
    private String name;
    @ApiModelProperty(value = "手机号码")
    @TableField(value = "phone")
    private String phone;
    @ApiModelProperty(value = "住宅电话")
    @TableField(value = "telephone")
    private String telephone;
    @ApiModelProperty(value = "家庭地址")
    @TableField(value = "address")
    private String address;
    @ApiModelProperty(value = "是否启用")
    @Getter(AccessLevel.NONE)
    private Boolean enabled;
    @ApiModelProperty(value = "用户名")
    @TableField(value = "username")
    private String username;
    @ApiModelProperty(value = "密码")
    @TableField(value = "password")
    private String password;
    @ApiModelProperty(value = "用户头像")
    @TableField(value = "userFace")
    private String userFace;
    @ApiModelProperty(value = "备注")
    @TableField(value = "remark")
    private String remark;
    @ApiModelProperty(value = "角色")
    @TableField(exist = false)
    private List<Role> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}

