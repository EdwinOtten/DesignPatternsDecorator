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
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
        String time = dateFormat.format(new Date());
        
        jTextPane.setText(time);
        System.out.println("set by TimezoneDecorator: "+time);
        
        specialClock.showClock(jTextPane);
    }
}