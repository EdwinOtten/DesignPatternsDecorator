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
public class SimpleClock implements Clock {
    @Override
    public void showClock(JTextPane jTextPane) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String time = dateFormat.format(cal.getTime());
        
        jTextPane.setText(time);
        jTextPane.repaint();
    }
}
