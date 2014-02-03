package simpledigitalwatchdecorator;

import javax.swing.JTextPane;

/**
 *
 * @author EdwinOtten
 */
public class SimpleClock implements Clock {
    @Override
    public void showClock(JTextPane jTextPane) {
        jTextPane.repaint();
    }
}
