class Ball {
  float x, y;
  float xVel, yVel;
  color c;
  PVector position;
  PVector velocity;
  PVector acceleration;

  Ball(float x, float y, float xVel, float yVel) {
    this.x = x;
    this.y = y;
    this.xVel = xVel;
    this.yVel = yVel;
    c = color(random(255), random(255), random(255));
    position = new PVector(x, y);
    velocity = new PVector(xVel, yVel);
    acceleration = PVector.random2D().mult(0.1);
  }

  void move() {
    //change the x based on the xVel
    //change the y based on the yVel
    xVel += acceleration.x;
    yVel += acceleration.y;
    x += xVel;
    y += yVel;
    velocity.add(acceleration);
    position.add(velocity);
    x = position.x;
    y = position.y;
  }

  void bounce() {
    // If a ball touches any border of the sketch
    // change the direction of the movement multiplying by -1
    if (x < 0 || x > width) {
      xVel *= -1;
      velocity.x *= -1;
    }
    if (y < 0 || y > height) {
      yVel *= -1;
      velocity.y *= -1;
    }
  }

  void display() {
    // Draw a circle at the x, y position
    // Make sure it is the correct color
    fill(c);
    noStroke();
    ellipse(x, y, 40, 40);
  }
}
