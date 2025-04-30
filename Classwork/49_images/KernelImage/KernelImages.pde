PImage bird;
PImage output;
Kernel k;
int curr = 0;
String[] names;
Kernel[] kernels;

void setup() {
  size(1370, 800);
  bird = loadImage("bird.jpg");
  output = bird.copy();
  names = new String[]{
    "Identity", "Blur", "Sharpen",
    "Outline", "Left Sobel", "Right Sobel",
    "Top Sobel", "Emboss"
  };

  kernels = new Kernel[] {
    new Kernel(new float[][] {
      {0, 0, 0},
      {0, 1, 0},
      {0, 0, 0}
    }),
    new Kernel(new float[][] {
      {.111, .111, .111},
      {.111, .111, .111},
      {.111, .111, .111}
    }),
    new Kernel(new float[][] {
      {0, -1, 0},
      {-1, 5, -1},
      {0, -1, 0}
    }),
    new Kernel(new float[][] {
      {-1, -1, -1},
      {-1, 8, -1},
      {-1, -1, -1}
    }),
    new Kernel(new float[][] {
      {1, 0, -1},
      {2, 0, -2},
      {1, 0, -1}
    }),
    new Kernel(new float[][] {
      {-1, 0, 1},
      {-2, 0, 2},
      {-1, 0, 1}
    }),
    new Kernel(new float[][] {
      {1, 2, 1},
      {0, 0, 0},
      {-1, -2, -1}
    }),
    new Kernel(new float[][] {
      {-2, -1, 0},
      {-1, 1, 1},
      {0, 1, 2}
    })
  };
  k = kernels[curr];
  k.apply(bird, output);
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
  } else if (keyCode == LEFT) {
    curr = (curr - 1 + kernels.length) % kernels.length;
    k = kernels[curr];
  } else if (keyCode == RIGHT) {
    curr = (curr + 1) % kernels.length;
    k = kernels[curr];
  }

  k.apply(bird, output);
}
