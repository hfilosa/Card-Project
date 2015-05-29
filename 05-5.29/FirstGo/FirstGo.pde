void setup(){
   size(800,800);
   Player p = new Player();
   p.display();
}

class Player{
  float xcor;
  float ycor;
  
  Player(){
    xcor=width/2;
    ycor=height/2;
  }
  
  void setxcor()
  
  void display(){
    ellipseMode(CENTER);
    fill(200);
    ellipse(xcor,ycor,20,20);
  }
  
  void move(){
    if (keyPressed){
      if (key == 'a' || key == 'A' || key == LEFT){
        
      if (key == 'w' || key == 'W' || key == UP)
      if (key == 's' || key == 'S' || key == DOWN)
      if (key == 'd' || key == 'D' || key == RIGHT)
}
