package simpledigitalwatchdecorator;

import java.awt.Color;
import javax.swing.JTextPane;

/**
 *
 * @author EdwinOtten
 */
public class ColorDecorator extends ClockDecorator {

    public ColorDecorator(Clock specialClock) {
        super(specialClock);
    }

    @Override
    public void showClock(JTextPane jTextPane) {
        addColors(jTextPane);
        specialClock.showClock(jTextPane);
    }

    private void addColors(JTextPane jTextPane) {

        if (jTextPane.getForeground().equals(Color.BLACK)) {
            jTextPane.setBackground(Color.BLACK);
            jTextPane.setForeground(Color.GREEN);
        } else {
            jTextPane.setBackground(Color.WHITE);
            jTextPane.setForeground(Color.BLACK);
        }

    }
}