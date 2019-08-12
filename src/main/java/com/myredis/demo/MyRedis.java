/*
 * 文件名：MyRedis.java
 * 版权：Copyright 2018-2019 Love. Co. Ltd. All Rights Reserved.
 * 描述：Anthony.CHONG
 * 修改人：zuochongchong
 * 修改时间：2019年08月11日
 * 修改内容：新建
 * 系统名称：Demo
 */
package com.myredis.demo;

import redis.clients.jedis.Jedis;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author CHONG
 * @version 1.0 2019年08月11日
 * @see MyRedis
 * @since 1.0
 */
public class MyRedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        System.out.println(jedis.ping());
    }
}
