ArrayList<Ball> ballList;
void setup() {
  size(1000, 800);
  ballList = new ArrayList<Ball>();
}

void mouseClicked() {
  // Add a new Ball to the ballList with mouse position and random velocity
  //The x and y positions are the same as the mouse
  //the xVel and yVel should be random values in the range (-3.0, 3.0)
  float xVel = random(-3, 3);
  float yVel = random(-3, 3);
  ballList.add(new Ball(mouseX, mouseY, xVel, yVel));
}

void draw() {
   // You may change the background
  background(173, 216, 230);
  for (Ball b : ballList) {
    b.move();
    b.bounce();
    b.display();
  }
  fill(0);
  text(ballList.size(), 20, 40);
}

