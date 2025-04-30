PImage bird;
PImage output;
Kernel k;

void setup() {
  size(1370, 800);
  bird = loadImage("bird.jpg");
  output = bird.copy();

  k = new Kernel(new float[][] {
    {-1, -1, -1},
    {-1,  8, -1},
    {-1, -1, -1}
  });
  k2 = new Kernel( new float[][] {
    {.11, .11, .11},
    {.11, .11, .11},
    {.11, .11, .11}
  } );

  k.apply(bird, output);
  image(bird, 0, 0);
  image(output, bird.width, 0);
}

void draw() {
  image(bird, 0, 0);
  image(output, bird.width, 0);
  fill(0);
}

void keyPressed() {
  if (key == '1') {
    k.setBoundaryMode(1);
  } else if (key == '2') {
    k.setBoundaryMode(2);
  } else if (key == '3') {
    k.setBoundaryMode(3);
  }
  k.apply(bird, output);
}
