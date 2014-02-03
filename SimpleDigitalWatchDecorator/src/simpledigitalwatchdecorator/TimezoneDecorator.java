package simpledigitalwatchdecorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JTextPane;

/**
 *
 * @author EdwinOtten
 */
public class TimezoneDecorator extends ClockDecorator {

    public TimezoneDecorator(Clock specialClock) {
        super(specialClock);
    }

    @Override
    public void showClock(JTextPane jTextPane) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat.format(cal.getTime());
        
        jTextPane.setText(dateFormat.toString());
        System.out.println("set to UTC.");
        
        specialClock.showClock(jTextPane);
    }
}