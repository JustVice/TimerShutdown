package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Wait extends Thread {

    private final int time;

    public Wait(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Wait.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
