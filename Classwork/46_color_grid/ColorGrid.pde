static final int SQUARE_SIZE = 80;
int [][]grid;

void setup() {
  size(500, 420);
  // This is just a SAMPLE grid (2D array): columns map to X, rows map to Y
  // This grid must be of dimensions: int[width/SQUARE_SIZE][height/SQUARE_SIZE]
  // grid = new int[height/SQUARE_SIZE][width/SQUARE_SIZE];
  // Assign random 1 or 0 values to each position of your grid
  int rows = height / SQUARE_SIZE;
  int cols = width / SQUARE_SIZE;

  grid = new int[rows][cols];
  for (int row = 0; row < rows; row++) {
    for (int col = 0; col < cols; col++) {
      grid[row][col] = int(random(2));
    }
  }
}


void draw() {
  // First, test drawGrid()
  // drawGrid();
  // Second, when drawGrid() works, you may comment it out. Then, you can implement fillGrid(int[][]colors)
  // fillGrid(grid);
  fillGrid(grid);
  drawGrid();
}


/* Fill the screen with squares.
 * Border color should be white.
 * No worries if the is a gap on the right and bottom side.
 */
void drawGrid() {
  stroke(255); 
  noFill();
  for (int row = 0; row < grid.length; row++) {
    for (int col = 0; col < grid[0].length; col++) {
      rect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
    }
  }
}

/* Fills the squares based on the grid values 0 ana 1
 * When the value is 0, choose a color to fill the square from 0 to 255 
 * When the value is 1, choose a different color from 0 to 255
 */
void fillGrid(int[][]colors) {
  noStroke();
  
  for (int row = 0; row < colors.length; row++) {
    for (int col = 0; col < colors[0].length; col++) {
      if (colors[row][col] == 1) {
        fill(0); 
      } else {
        fill(180); 
      }
      rect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
    }
  }
}
 


/* mouseClicked() is function called after a mouse button has been pressed and then released. 
 * When you click on a square, you must change the value in the grid 2D array. Alternate between 0 and 1.
 * Identify the square based on the mouse position variables: mouseX and mouseY.
 * Call the method fillGrid(int[][])
 * Clicking this will toggle the color displayed by your method fillGrid(int[][]).
 * Make sure you are invoking the method fillGrid(int[][]) in your draw().
*/
void mouseClicked() {
  int col = mouseX / SQUARE_SIZE;
  int row = mouseY / SQUARE_SIZE;
  if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
    grid[row][col] = 1 - grid[row][col]; 
  }
}
