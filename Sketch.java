import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    //Set background to blue
    background(135, 205, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Stroke settings for foreground
    stroke(0, 255, 0);
    strokeWeight(4);

    fill(140, 70, 20);

  //Foreground
    rect(-20, 375, 440, 400);
   
  //Roof
    triangle(200,60,310,150,90,150);

  //Body of house
    rect(90, 150, 220, 150);

  // Colour and stroke settings for sun
    fill(255, 255, 0);
    strokeWeight(1);
    stroke(0);

  //Sun
    ellipse(0, 0, 200, 200);

  //Colour for window
    fill(255, 255, 255);

  //Window
    ellipse(200, 105, 20, 20);
  }
  
  
}