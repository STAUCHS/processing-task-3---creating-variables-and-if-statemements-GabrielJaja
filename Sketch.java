import processing.core.PApplet;

import java.util.Random;

public class Sketch extends PApplet {
	int intRed;
  int intBlue;
  int intGreen;
	
  public void settings() {
	// put your size call here
    size(400, 400);

  }

  public void setup() {
    
    // making Random int
    Random myRandom = new Random();
    intRed = myRandom.nextInt(0, 255);
    intBlue = myRandom.nextInt(0, 255);
    intGreen = myRandom.nextInt(0, 255);
  

    background(myRandom.nextInt(0, 255), myRandom.nextInt(0, 255), myRandom.nextInt(0, 255));
    text("More Colours", 40, 333);
    
    // Time Display
    int hr = hour();
    int min = minute();
    int year = year();
    text(min, 300, 160);
    text(hr, 200, 110);
    text(year, 400, 400);
    
    if (intBlue < 90) {
      fill(intBlue, intGreen, intRed);
    }
    if (minute() < 10) {
    }
    else if (intRed <= 90) {
      stroke(0, 0, 0);

    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    size(400, 400);
    stroke(300);
    stroke(200);
    fill(intRed, intBlue , intGreen);
    
    rect(55, 100, 55, 100);
  
    rect(300, 100, 55, 100);

    triangle(55, 120, 300, 240, 55, 55);
  
    triangle(355, 120, 135, 240, 355, 55);
  
  }


  
}
