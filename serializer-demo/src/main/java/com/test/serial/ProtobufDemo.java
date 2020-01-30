package com.test.serial;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author harry
 */
public class ProtobufDemo {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        //fluent
        UserProto.User user=
                UserProto.User.newBuilder().
                        setName("Mic").setAge(18).build();

        ByteString bytes=user.toByteString();

        System.out.println();

        UserProto.User nUser=UserProto.User.parseFrom(bytes);
        System.out.println(nUser);
        //BitMap/BitSet
    }
}
