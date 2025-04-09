int x, y, animation;
int vx = 3;
int vy = 2;
void setup(){
  size(800, 600);
  x = width/2;
  y = height/2;
  animation = 2;
}

void draw(){
  background(255, 192, 203); // You may change the background
  avatar(x,y);
  if (animation == 1) {
    // reset
    x = width/2;
    y = height/2;
  }
  else if (animation == 2) {
    // bounce
    x += vx;
    y += vy;
    if (x > width - 40 || x < -20) {
      vx *= -1;
    }
    if (y > height - 35 || y < 35) {
      vy *= -1;
    }
  }
  else if (animation == 3) {
    // random position
    x = int(random(width));
    y = int(random(height));
  }
  else if (animation == 4) {
    // mouse position
    // Read: https://processing.org/reference/mouseX.html
    x = mouseX;
    y = mouseY;
  }
  else {
    x++;
    y++;
  }

}
void avatar(int x, int y){
  //head
  fill(255);
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

  // nose
  //triangle(x1, y1, x2, y2, x3, y3)
  fill(#F58905);
  triangle(x+17, y-65, x+27, y-65, x+22, y-59);
  noFill();
}
  
