package com.java.mudancas_java_8_21.virtual_threads.advanced;
import com.java.mudancas_java_8_21.virtual_threads.advanced.client.Client;
import com.java.mudancas_java_8_21.virtual_threads.advanced.client.EchoClient;

import java.io.IOException;
import java.net.InetAddress;

//  Vou solucionar esse erro em outro commit. Partindo para o próximo assunto
// Couldn't get I/O for the connection to DESKTOP-J38CSCD

//  Vou atualizar a IDE e depois vou testar novamente. Não funcionou, mas parece estar tudo certo
public class ClientMain {

    public static void main(String[] args) {
        try {
            Client client = new EchoClient("127.0.0.1", 6666);
            client.connect();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }

    }

}
