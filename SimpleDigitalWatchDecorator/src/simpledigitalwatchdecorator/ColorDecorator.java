/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledigitalwatchdecorator;

/**
 *
 * @author EdwinOtten
 */
public class ColorDecorator extends ClockDecorator {

  public ColorDecorator (Clock specialClock) {
    super(specialClock);
  }

  @Override
  public void showClock() {
    addColors();
    specialClock.showClock();
  }

  private void addColors() {
    System.out.println("Red clock");
  }
}