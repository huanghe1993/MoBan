package com.anyikang.model.vo.admin;

import java.io.Serializable;

/**
 * 
 * @author wangwei
 * @date 2017年6月29日
 */
public class UserCredentials implements Serializable {
    private static final long serialVersionUID = 1L;
//    private  Integer userId;
    private Integer roleId;
    private  String tokenId;

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
}
