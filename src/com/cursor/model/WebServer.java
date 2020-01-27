package com.cursor.model;

public class WebServer extends Thread {
    private Request request;

    public WebServer(Request request) {
        this.request = request;
    }

    @Override
    public void run() {
        System.out.println("This thread has request " + request.getName());
    }
}
