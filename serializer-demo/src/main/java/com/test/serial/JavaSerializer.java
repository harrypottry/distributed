package com.test.serial;


import java.io.*;

/**
 * @author harry
 */
public class JavaSerializer implements ISerializer {

    @Override
    public <T> byte[] serializer(T obj) {
        ObjectOutputStream objectOutputStream=null;
        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File("user")));
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(objectOutputStream!=null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public <T> T deSerializer(byte[] data, Class<T> clazz) {
        ObjectInputStream objectInputStream=null;
        try {
            objectInputStream=new ObjectInputStream(new FileInputStream(new File("user")));
            return (T)objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(objectInputStream!=null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
