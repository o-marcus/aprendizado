package com.java.mudancas_java_8_21.virtual_threads.advanced;

import com.java.mudancas_java_8_21.virtual_threads.advanced.server.EchoServer;
import com.java.mudancas_java_8_21.virtual_threads.advanced.server.Server;

import java.io.IOException;

public class ServerMain {

    public static void main(String[] args) {
        try {
            Server server = new EchoServer(6666);
            server.open();
        }
        catch (IOException exception) {
            System.out.println(exception.toString());
        }

    }

}
