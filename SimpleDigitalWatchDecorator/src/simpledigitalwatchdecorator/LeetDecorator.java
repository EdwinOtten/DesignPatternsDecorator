package simpledigitalwatchdecorator;

import java.awt.Color;
import javax.swing.JTextPane;

/**
 *
 * @author EdwinOtten
 */
public class LeetDecorator extends ClockDecorator {

    public LeetDecorator(Clock specialClock) {
        super(specialClock);
    }

    @Override
    public void showClock(JTextPane jTextPane) {
        specialClock.showClock(jTextPane);
        addColors(jTextPane);
    }

    private void addColors(JTextPane jTextPane) {
        System.out.println("1337 colors added");
        jTextPane.setBackground(Color.BLACK);
        jTextPane.setForeground(Color.GREEN);


    }
}