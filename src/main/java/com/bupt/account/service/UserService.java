package com.bupt.account.service;

import com.bupt.account.model.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Description:  ---——require需求|ask问题|jira
 * Design :  ----the  design about train of thought 设计思路
 * User: yezuoyao
 * Date: 2019-03-01
 * Time: 15:52
 * Email:yezuoyao@huli.com
 *
 * @author yezuoyao
 * @since 1.0-SNAPSHOT
 */

public interface UserService {
   /**
    * 通过id找用户
    * @param id
    * @return User
    */
   User findById(Long id);

   /**
    * 创建用户
    * @param user
    */
   void create(User user);

   /**
    * 更新用户
    * @param user
    */
   void update(User user);

   /**
    * 删除用户
    * @param id
    */
   void delete(Long id);

   /**
    * 获取所有用户
    * @return List<User>
    */
   List<User> getAll();
}
