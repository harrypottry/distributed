package com.test.protocol;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author harry
 */
public class ClientSocketDemo {

    public static void main(String[] args) throws IOException {
        Socket socket=null;
        try{
            socket=new Socket("127.0.0.1",8080);
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            out.println("Hello");
        }catch (Exception e){

        }finally {
            if(socket!=null) {
                socket.close();
            }
        }
    }
}
