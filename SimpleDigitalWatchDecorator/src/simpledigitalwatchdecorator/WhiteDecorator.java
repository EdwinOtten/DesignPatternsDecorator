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
        addColors(jTextPane);
        specialClock.showClock(jTextPane);
    }

    private void addColors(JTextPane jTextPane) {
        System.out.println("white colors added");

        jTextPane.setBackground(Color.WHITE);
        jTextPane.setForeground(Color.BLACK);


    }
}