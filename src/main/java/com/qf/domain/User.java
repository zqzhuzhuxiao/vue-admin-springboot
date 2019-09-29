package com.qf.domain;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;

import javax.persistence.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/9/25
 * \* Time: 10:55
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String pass;
}