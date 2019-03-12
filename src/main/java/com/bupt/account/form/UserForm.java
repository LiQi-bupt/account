package com.bupt.account.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 用户注册所用表单
 */
@Data
public class UserForm {
    /**
     * 用户open_id
     */
    @NotEmpty(message = "姓名必填")
    private String open_id;

    /**
     * 用户密码
     */
    @NotEmpty(message = "密码必填")


    /**
     * 用户手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;


}
