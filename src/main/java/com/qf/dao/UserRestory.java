package com.qf.dao;

import com.qf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/9/25
 * \* Time: 10:59
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface UserRestory extends JpaRepository<User,Integer> {

}