package com.lc.mapper;

import com.lc.domain.UserTb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity com.lc.domain.UserTb
 */
public interface UserTbMapper  {
     void add(UserTb user);

     List<UserTb> getAllUser();

     void delByUserId(Long id);

     UserTb selectUserByNameAndPassword(@Param("userAccount") String userAccount,
                                        @Param("userPassword") String userPassword);
}




