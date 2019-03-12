package com.bupt.account.dataobject;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Table(name = "user_info")
@Entity
public class UserInfo {

    /**自增主键id*/
    @Id
    private BigDecimal id;

    /**open_id*/
    private String open_id;

    /**密码*/
    private String password;

    /**目前状态*/
    private int status ;

    /**邮箱*/
    private String email;

    /**电话*/
    private String phone;

    /**uid*/
    private String uid;

    /**三个附加段 目前无用*/
    private String add1;
    private String add2;
    private String add3;

}
