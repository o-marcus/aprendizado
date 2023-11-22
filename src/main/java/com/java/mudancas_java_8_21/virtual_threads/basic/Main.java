package com.java.mudancas_java_8_21.virtual_threads.basic;

public class Main {

    public static void main(String[] args) {
        try {
            startTwoThreads();
            newThread();
            newThreadWithName();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


    //  Criando uma Thread Virtual com instância de ThreadBuilder e espera a execução dela terminar com join
    public static void newThread() throws InterruptedException {
        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Olá"));
        thread.join();
    }

    //  Criadndo uma Thread virtual com nome usando o Builder
    public static void newThreadWithName() throws InterruptedException {
        Thread.Builder builder = Thread.ofVirtual().name("MyThread");
        Runnable task = () -> {
            System.out.println("Executando thread");
        };
        Thread t = builder.start(task);
        System.out.println("Nome da thread t: " + t.getName());
        t.join();
    }

    //  Criando duas Threads virtuais e executando elas
    public static void startTwoThreads() throws InterruptedException {
        Thread.Builder builder = Thread.ofVirtual().name("worker-", 0);
        Runnable task = () -> {
            System.out.println("ID da Thread: " + Thread.currentThread().threadId());
        };

        // nome "trabalhador-0"
        Thread t1 = builder.start(task);
        t1.join();
        System.out.println(t1.getName() + " terminada");

        // nome "trabalhador-1"
        Thread t2 = builder.start(task);
        t2.join();
        System.out.println(t2.getName() + " terminada");
    }


}
