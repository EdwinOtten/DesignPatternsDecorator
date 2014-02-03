package simpledigitalwatchdecorator;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EdwinOtten
 */
public class Main {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // Create the view
        ClockView view = new ClockView();
        
        // Netbeans doesn't like sleep() in a loop, so we do it in a try-catch block
        try {
            for (int i = 0; i < 999999999; i++) {
                    // Pause for 1 second
                    Thread.sleep(1000);
                    // update the view
                    view.update();
            }   
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
