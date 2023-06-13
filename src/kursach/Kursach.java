package kursach;

import network.MainThread;
import network.Server;


public class Kursach extends Thread
{
public static final int PORT = 8080;

    public static void main(String[] args) throws InterruptedException
    {
        Server      server  = new Server(PORT);
        MainThread  mThread = new MainThread(PORT);

        server.start();
        mThread.start();
    }
}
