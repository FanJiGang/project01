package cn.fan.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtils {
    //创建连接池
    private static JedisPool pool;
    private static JedisPoolConfig config;

    static {
        config = new JedisPoolConfig();
        config.setMaxTotal(30);  //设置最大连接数
        config.setMaxIdle(2);  //设置最大空闲连接数

        pool =new JedisPool(config,"127.0.0.1",6379);
    }

    //获取连接
    public static Jedis getJedis(){
        return pool.getResource();
    }

    //释放连接
    public static void close(Jedis j){
        j.close();
    }
}
