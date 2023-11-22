package com.java.mudancas_java_8_21.virtual_threads.advanced.client;

import java.io.IOException;

public sealed interface Client permits EchoClient {

    void connect() throws IOException;

}
