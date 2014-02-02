package simpledigitalwatchdecorator;

import javax.swing.JTextPane;

/**
 *
 * @author EdwinOtten
 */
abstract class ClockDecorator implements Clock {
    
    protected Clock specialClock;
    
    public ClockDecorator (Clock specialClock) {
        this.specialClock = specialClock;
    }

    @Override
    public void showClock(JTextPane jTextPane) {
        specialClock.showClock(jTextPane);
        jTextPane.repaint();
    }
    
}
