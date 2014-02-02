/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledigitalwatchdecorator;

/**
 *
 * @author EdwinOtten
 */
abstract class ClockDecorator implements Clock {
    
    protected Clock specialClock;
    
    public ClockDecorator (Clock specialClock) {
        this.specialClock= specialClock;
    }

    @Override
    public void showClock() {
        specialClock.showClock();
    }
    
}
