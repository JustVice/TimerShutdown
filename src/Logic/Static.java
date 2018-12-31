package Logic;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Static {

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/iconLogo.png"));
    }

    public static String command = "shutdown -s -t ", title = "Shutdown", version = "v1.5";
    public static int defaultTimeToExecuteWait = 400;
    public static int timeForPopUpMessages = 2500;

    public static void Shutdown(int time) {
        try {
            Process process = Runtime.getRuntime().exec(command + time);
        } catch (IOException ex) {
            Logger.getLogger(Static.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void cancelShutdown() {
        try {
            Process process = Runtime.getRuntime().exec("shutdown -a");
        } catch (IOException ex) {
            Logger.getLogger(Static.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
