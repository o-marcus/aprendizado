package com.java.mudancas_java_8_21.virtual_threads.advanced.server;

import java.io.IOException;

public sealed interface Server permits EchoServer {

    void open() throws IOException;

}
