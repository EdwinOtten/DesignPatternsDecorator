/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledigitalwatchdecorator;

/**
 *
 * @author EdwinOtten
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Clock clock = new ColorDecorator(new TimezoneDecorator(new SimpleClock()));
        clock.showClock();
    }
}
