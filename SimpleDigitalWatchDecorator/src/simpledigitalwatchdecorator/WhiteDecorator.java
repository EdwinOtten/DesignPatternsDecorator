package simpledigitalwatchdecorator;

import java.awt.Color;
import javax.swing.JTextPane;

/**
 *
 * @author EdwinOtten
 */
public class WhiteDecorator extends ClockDecorator {

    public WhiteDecorator(Clock specialClock) {
        super(specialClock);
    }

    @Override
    public void showClock(JTextPane jTextPane) {
        specialClock.showClock(jTextPane);
        addColors(jTextPane);
    }

    private void addColors(JTextPane jTextPane) {
        jTextPane.setBackground(Color.WHITE);
        jTextPane.setForeground(Color.BLACK);
    }
}