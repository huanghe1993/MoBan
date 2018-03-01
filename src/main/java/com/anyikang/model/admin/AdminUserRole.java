package com.anyikang.model.admin;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * 
 * @author wangwei
 * @date 2017年6月29日
 */
@TableName("admin_user_role")
public class AdminUserRole extends Model<AdminUserRole> {

    private static final long serialVersionUID = 1L;

	@TableId("user_id")
	private Integer userId;
	@TableField("role_id")
	private Integer roleId;


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
