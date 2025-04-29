public class Kernel {
  float[][]kernel;

  /**Constructor takes the kernel that will be applied to the image
  *This implementation only allows 3x3 kernels
  */
  public Kernel(float[][]init) {
    kernel = init;
  }

  /**If part of the kernel is off of the image, return black, Otherwise
  *Calculate the convolution of r/g/b separately, and return that color\
  *if the calculation for any of the r,g,b values is outside the range
  *     0-255, then clamp it to that range (< 0 becomes 0, >255 becomes 255)
  */
  color calcNewColor(PImage img, int x, int y) {
    float r = 0;
    float g = 0;
    float b = 0;

    for (int i = -1; i <= 1; i++) {
      for (int j = -1; j <= 1; j++) {
        int xi = x + i;
        int yj = y + j;

        if (xi < 0 || xi >= img.width || yj < 0 || yj >= img.height) {
          continue; 
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

  /**Apply the kernel to the source,
  *and saves the data to the destination.*/
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

}
