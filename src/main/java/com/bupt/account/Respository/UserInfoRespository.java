package com.bupt.account.Respository;

import com.bupt.account.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoRespository extends JpaRepository<UserInfo,String> {
    /**
     * 通过id查询用户信息
     * @param Id
     * @return
     */
    UserInfo  findUserInfoById(String Id);

    /**
     * 通过name查询用户信息
     * @param name
     * @return
     */
    UserInfo findUserInfosByName(String name);

    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo> findAll();
}
