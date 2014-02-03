package simpledigitalwatchdecorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JTextPane;

/**
 *
 * @author EdwinOtten
 */
public class DarwinDecorator extends ClockDecorator {

    public DarwinDecorator(Clock specialClock) {
        super(specialClock);
    }

    @Override
    public void showClock(JTextPane jTextPane) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Australia/Darwin"));
        String time = dateFormat.format(new Date());
        
        jTextPane.setText(time);
        
        specialClock.showClock(jTextPane);
    }
}