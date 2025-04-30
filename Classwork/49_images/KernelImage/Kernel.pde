public class Kernel {
  float[][] kernel;
  int boundaryMode = 1; 

  public Kernel(float[][] init) {
    kernel = init;
  }

  void setBoundaryMode(int mode) {
    if (mode >= 1 && mode <= 3) {
      boundaryMode = mode;
    }
  }

  color calcNewColor(PImage img, int x, int y) {
    float r = 0;
    float g = 0;
    float b = 0;

    for (int i = -1; i <= 1; i++) {
      for (int j = -1; j <= 1; j++) {
        int xi = x + i;
        int yj = y + j;

        if (boundaryMode == 1) { 
          if (xi < 0 || xi >= img.width || yj < 0 || yj >= img.height) {
            return color(0,0,0);
          }
        } else if (boundaryMode == 2) { 
          xi = constrain(xi, 0, img.width - 1);
          yj = constrain(yj, 0, img.height - 1);
        } else if (boundaryMode == 3) { 
          xi = (xi + img.width) % img.width;
          yj = (yj + img.height) % img.height;
        }

        color c = img.get(xi, yj);
        r += red(c) * kernel[i + 1][j + 1];
        g += green(c) * kernel[i + 1][j + 1];
        b += blue(c) * kernel[i + 1][j + 1];
      }
    }

    r = constrain(r, 0, 255);
    g = constrain(g, 0, 255);
    b = constrain(b, 0, 255);

    return color(r, g, b);
  }

  void apply(PImage source, PImage destination) {
    source.loadPixels();
    destination.loadPixels();

    for (int y = 0; y < source.height; y++) {
      for (int x = 0; x < source.width; x++) {
        destination.pixels[y * source.width + x] = calcNewColor(source, x, y);
      }
    }

    destination.updatePixels();
  }
}
