/**
 * SNAKE GAME
 * Rules:
 *     Eat the food
 *     Do not bite your own tail
 *     Do not hit a wall
 * Specifications:
 *     The snake grows when eat food
 *     The speed increases when the snake grows
 *     Food is displayed randomly
 *     Food and parts of the snake body are squares
 */

// global variables
ArrayList<PVector> snake = new ArrayList<PVector>(); // snake body (not included the head)
PVector pos; // snake position (position of the head)

StringList mode_list = new StringList(new String[] {"border", "no_border"}); // if you implement both functionalities
int mode_pos = 1; // mode 1 by default - if hits wall wraps around
String actual_mode = mode_list.get(mode_pos); // current mode name

PVector food; // food position

PVector dir = new PVector(0, 0); // snake direction (up, down, left right)

int size = 40; // snake and food square size
int w, h; // how many snakes can be allocated

int spd = 20; // reverse speed (smaller spd will make the snake move faster)
int len = 4; // snake body

void setup() {
  size(1080, 720);
  w = width/size;
  h = height/size;
  
  pos = new PVector(w/2, h/2); // Initial snake position
  newFood(); // create 2D vector
  
  noStroke();
  fill(0);
}

void draw() {
  background(200);
  drawSnake();
  drawFood();
  
  // update snake if frameCount is a multiple of spd which is 20 at the begining
  if(frameCount % spd == 0) {
    updateSnake();   
  }
}

// draw the food item (square) which size is tha variable size
void drawFood() {
  fill(255, 0, 0);
  rect(food.x * size, food.y * size, size, size);
}

// declare a new pVector (random) for food
void newFood() {
  int x = int(random(w));
  int y = int(random(h));
  food = new PVector(x, y);
}

// draw snake, consider the snake array size (each square of size size) + square of the current pos
void drawSnake() {
  fill(0); 
  for (PVector part : snake) {
    rect(part.x * size, part.y * size, size, size);
  }
  rect(pos.x * size, pos.y * size, size, size); 
}

void updateSnake() {
  // Add current position(head) to snake ArrayList
  // Check the size of snake. Remove some items from snake ArrayList if needed
  // Calculate new position of snake (head). You must use the direction vector for this calculation
  // If snake (head) hits food, add +1 to the snake size and create a new food
  // If snake (head) eats itself, gameover, reset()
  // If mode 'no_border', snake is out of screen, wraps around
  // If mode 'border', when snake hit a border, gameover, reset()

  snake.add(pos.copy());
  while (snake.size() > len) {
    snake.remove(0);
  }
  pos.add(dir);
  if (actual_mode.equals("no_border")) {
    if (pos.x < 0) pos.x = w - 1;
    if (pos.x >= w) pos.x = 0;
    if (pos.y < 0) pos.y = h - 1;
    if (pos.y >= h) pos.y = 0;
  } else {
    if (pos.x < 0 || pos.x >= w || pos.y < 0 || pos.y >= h) {
      reset(); 
      return;
    }
  }
  for (PVector part : snake) {
    if (part.equals(pos)) {
      reset(); 
      return;
    }
  }
  if (pos.equals(food)) {
    len++;
    if (spd > 5) spd--; 
    newFood();
  }
}

void reset() {
  spd = 20;
  len = 5;
  pos = new PVector(w/2, h/2);
  dir = new PVector(0, 0);
  newFood();
  snake = new ArrayList<PVector>();
}

void keyPressed() {
  // if UP is pressed => dir = new PVector(...)
  // same thing for DOWN, LEFT, RIGHT
  // UP (0, -1)
  // DOWN(0, 1)
  // LEFT(-1,0)
  // RIGHT(1,0)
  if (keyCode == UP && dir.y != 1) dir = new PVector(0, -1);
  else if (keyCode == DOWN && dir.y != -1) dir = new PVector(0, 1);
  else if (keyCode == LEFT && dir.x != 1) dir = new PVector(-1, 0);
  else if (keyCode == RIGHT && dir.x != -1) dir = new PVector(1, 0);
  else if (key == 'm') {
    mode_pos = (mode_pos + 1) % mode_list.size();
    actual_mode = mode_list.get(mode_pos);
  } else if (key == '+') {
    size += 5;
    w = width / size;
    h = height / size;
  } else if (key == '-') {
    size = max(10, size - 5);
    w = width / size;
    h = height / size;
  }
}

// EXTRA FOR STUDENTS WHO FINISH WITH THE REQUIRED TASKS
// if '+' is pressed, increase the size of the squares (and recalculate w and h)
// same thing for '-'
// when 'm' is pressed, change the mode -> ONLY IF YOU IMPLEMENT BOTH MODES
// add colors: 
//     1. make the food colorful and when the snake eats the food, it adopts that color
//     2. make the backgroud looks like a grid adding colors
