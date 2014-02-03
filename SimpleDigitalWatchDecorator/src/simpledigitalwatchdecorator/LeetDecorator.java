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
        addColors(jTextPane);
        specialClock.showClock(jTextPane);
    }

    private void addColors(JTextPane jTextPane) {

        jTextPane.setBackground(Color.BLACK);
        jTextPane.setForeground(Color.GREEN);


    }
}