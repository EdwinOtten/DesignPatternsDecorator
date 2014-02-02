/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledigitalwatchdecorator;

/**
 *
 * @author EdwinOtten
 */
public class TimezoneDecorator extends ClockDecorator {

  public TimezoneDecorator (Clock specialClock) {
    super(specialClock);
  }

  @Override
  public void showClock() {
    changeTimezone();
    specialClock.showClock();
  }

  private void changeTimezone() {
    System.out.println("Amsterdam clock");
  }
}