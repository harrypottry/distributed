package com.test.serial;

/**
 * @author harry
 */
public interface ISerializer {

    <T> byte[] serializer(T obj);

    <T> T deSerializer(byte[] data,Class<T> clazz);
}
