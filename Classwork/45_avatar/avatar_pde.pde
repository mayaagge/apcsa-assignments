int x, y, animation;

void setup(){
  size(800, 600);
  x = width/2;
  y = height/2;
  animation = 2;
}

void draw(){
  background(255, 192, 203); // You may change the background
  avatar(180,190);
  if (animation == 1) {
    // reset
  }
  else if (animation == 2) {
    // bounce
  }
  else if (animation == 3) {
    // random position
  }
  else if (animation == 4) {
    // mouse position
    // Read: https://processing.org/reference/mouseX.html
  }
  else {
    x++;
    y++;
  }

}
void avatar(int x, int y){
  //head
  ellipse(x+20, y-70, 70, 70);
  stroke(1);

  //eyes
  //left eye
  fill(0);
  ellipse(x, y-70, 13, 13);
  //right eye
  ellipse(x+40, y-70, 13, 13);
  //eyes
  //left eye
  fill(255);
  ellipse(x+2, y-73, 5, 5);
  //right eye
  ellipse(x+42, y-73, 5, 5);

  //buttons
  //first button
  fill(0);
  ellipse(x+5, y-25, 10, 10);
  ellipse(x, y+5, 10, 10);
  ellipse(x+5, y+30, 10, 10);
  noFill();

  // nose
  //triangle(x1, y1, x2, y2, x3, y3)
  //fill(#F58905);
  triangle(x+17, y-65, x+27, y-65, x+22, y-59);
  noFill();

  // right arm
  strokeWeight(2);
  line(x+40, y-10, x+120, y-60 );
  strokeWeight(1);
}
  
