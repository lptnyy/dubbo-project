package com.yunding.redis;

/**
 * 函数接口
 * @param <T>
 */
public interface IRedisCallback<T> {
    public T callback();
}
