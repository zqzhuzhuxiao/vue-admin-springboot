package com.qf.Response;

import lombok.Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/9/25
 * \* Time: 23:41
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
public class ResponseUser<T> {

    private List<T> list;

    private Long total;
}