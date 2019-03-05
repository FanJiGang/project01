package cn.fan.utils;

import redis.clients.jedis.Jedis;

public class TestCase {
    public static void main(String[] args) {
        Jedis jedis = JedisUtils.getJedis();
        

        JedisUtils.close(jedis);
    }
}
