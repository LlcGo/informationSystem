package com.lc.domain;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName user_tb
 */

@Data
public class UserTb implements Serializable {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户账户
     */
    private String userAccount;

    /**
     * 手机号码
     */
    private String userPhone;

    /**
     * 用户状态 0正常  1删除
     */
    private Integer userState;

    /**
     * 用户角色  0普通用户  1管理员
     */
    private Integer userRole;

    /**
     * 创建时间
     */
    private Date userCreate;

    /**
     * 出生日期
     */
    private Date userBirth;


    private static final long serialVersionUID = 1L;
}