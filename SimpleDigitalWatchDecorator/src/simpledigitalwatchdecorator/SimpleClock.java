/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledigitalwatchdecorator;

/**
 *
 * @author EdwinOtten
 */
public class SimpleClock implements Clock {
    @Override
    public void showClock() {
        System.out.println("SimpleClock shown");
    }
}
