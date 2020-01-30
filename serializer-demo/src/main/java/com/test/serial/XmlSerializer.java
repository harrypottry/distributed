package com.test.serial;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @author harry
 */
public class XmlSerializer implements ISerializer{

    XStream xStream=new XStream(new DomDriver());

    @Override
    public <T> byte[] serializer(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    @Override
    public <T> T deSerializer(byte[] data, Class<T> clazz) {
        return (T)xStream.fromXML(new String (data));
    }
}
