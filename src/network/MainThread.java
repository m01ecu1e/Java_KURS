package network;

import static network.GUI.showMenu;

public class MainThread extends Thread
{
    int PORT;

    public MainThread(int PORT)
    {
        this.PORT = PORT;
    }

    public void run()
    {
        showMenu(PORT);
    }
}
