package com.cursor;

import com.cursor.model.Request;
import com.cursor.model.WebServer;

public class Executor {
    public static void start() {
        Thread firstThread = new Thread(new WebServer(new Request("GET")));
        firstThread.start();
        Thread secondThread = new Thread(new WebServer(new Request("POST")));
        secondThread.start();
        Thread thirdThread = new Thread(new WebServer(new Request("HEAD")));
        thirdThread.start();
        Thread fourthThread = new Thread(new WebServer(new Request("PUT")));
        fourthThread.start();
        Thread fifthThread = new Thread(new WebServer(new Request("DELETE")));
        fifthThread.start();
    }
}
