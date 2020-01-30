package com.test.serial;

import com.alibaba.fastjson.JSON;

/**
 * @author harry
 */
public class FastjsonSerializer implements ISerializer{

    @Override
    public <T> byte[] serializer(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    @Override
    public <T> T deSerializer(byte[] data, Class<T> clazz) {
        return JSON.parseObject(new String(data),clazz);
    }
}
