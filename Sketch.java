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
    triangle(width/2,height*15/100,width*775/1000,height*375/1000,width*225/1000,height*375/1000);

  //Body of house
    rect(width*225/1000, height*375/1000, width*55/100, height*375/1000);

  // Colour and stroke settings for sun
    fill(255, 255, 0);
    strokeWeight(1);
    stroke(0);

  //Sun
    ellipse(width*0, height*0, width/2, height/2);

  //Colour for window
    fill(255, 255, 255);

  //Window
    ellipse(width/2, height*2625/10000, width/20, height/20);
  }
  
  
}