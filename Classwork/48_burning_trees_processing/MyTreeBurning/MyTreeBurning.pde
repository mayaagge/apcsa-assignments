BurnTrees burnT;
int rows;
int cols;
double density;
int squareSize;

void setup() {
  size(600, 500);
  rows = 50;
  cols = 60;
  density = .7;
  burnT = new BurnTrees(cols, rows, density);
  // What should be the value for squareSize? How do you calculate the squareSize using an expression? The squareSize should be as large as possible to fit the grid and we can calculate it by doing the minimum of the width over columns and height over rows.
  // Keep in mind that we can change the size of the sketch, rows and cols, so make sure your code will create squares on the sketch. 
  squareSize = min(width / cols, height / rows);
}

// Do not change the draw() method
void draw() {
  background(0);
  // frameCount indicates how many times this method is executed
  // Q: Why do we have this condtion frameCount % 10 == 0? We have this condition because it slows down the simulation so you can see it step-by-step instead of running as fast as possible.
  // WHat happens when you replace 10 with a greater or lower number? If you use a smaller number like 5 it goes faster but if you use a bigger number like 20 it goes slower.
  if (frameCount % 10 == 0 && !burnT.done()) {
    burnT.tick();
    //println("Tick: " + frameCount);
  }

  // This method converts the 2D array into a grid, color the squares red, green, grey, white
  drawSquares(burnT);

  //Output the resulting time and dimensions of the simulation
  if (burnT.done()) {
    fill(100);
    rect(20,00,450,20);
    fill(255);
    textSize(20);
    text("Simulation of "+cols+" by "+rows+" grid took "+burnT.getTicks()+" ticks", 20, 20);
  }
}

void mouseClicked() {
  // Reset the simulation by clicking the mouse (reset burnT).
  // You must use the original values when you reset.
  burnT = new BurnTrees(cols, rows, density);
}


void drawSquares(BurnTrees burnT) {
  // Draw the grid squares (rows x cols)
  // Fill in the squares with colors red (fire), green (tree), grey (ash), white (empty)
  // You may use burnT.map, it is in the same sketch
  for (int r = 0; r < rows; r++) {
    for (int c = 0; c < cols; c++) {
      int val = burnT.map[r][c];
      if (val == 1) fill(255, 0, 0); 
      else if (val == 2) fill(0, 200, 0); 
      else if (val == 3) fill(150);
      else fill(255); 
      rect(c * squareSize, r * squareSize, squareSize, squareSize);
    }
  }
}
