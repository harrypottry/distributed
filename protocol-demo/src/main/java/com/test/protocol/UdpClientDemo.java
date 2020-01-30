package com.test.protocol;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author harry
 */
public class UdpClientDemo {

    public static void main(String[] args) throws IOException {
        InetAddress address=InetAddress.getByName("localhost");
        byte[] sendData="Hello,mic".getBytes();
        DatagramPacket sendPacket=new
                DatagramPacket(sendData,sendData.length,address,8080);
        DatagramSocket datagramSocket=new DatagramSocket();
        datagramSocket.send(sendPacket);
    }
}
