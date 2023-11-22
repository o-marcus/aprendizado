package com.java.mudancas_java_8_21.virtual_threads.advanced.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public record EchoServer(int porta) implements Server{

    /*
    * Nesse exemplo, ele vai disparar uma Thread para ficar a retransmitir a mensagem para cada cliente
    * que se conectar a ele.
    * */

    public void open() throws IOException {

        try (ServerSocket socket = new ServerSocket(porta)) {
            System.out.println("Server is waiting for connections");
            // Aceita conexões
            Socket client = socket.accept();
            Thread.ofVirtual().start(() -> {
                try (
                        //  Para escrita
                        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

                        //  Para leitura
                        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                ) {
                    String inputLine = "";
                    while ((inputLine = in.readLine()) != null) {
                        //  Ele está reenviando todas as mensagens que está recebendo do client que se conectou
                        System.out.println(inputLine);
                        out.println(inputLine);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }

}
