package tp03;
import java.awt.Color;
import java.awt.Graphics;
public class Rectangle extends Figure{
 int x,y, height, width;
 Graphics theDrawer;
 public Rectangle( int x,int y, int height, int width){
 this.x = x; this.y =y;
 this.height = height; this.width = width;
 }
 public Rectangle( int x,int y, int height, int width, Color color){
 this(x,y, height, width);
 this.color = color;
 }
 public void setTheDrawer(Graphics theDrawer){
 this.theDrawer = theDrawer;
 }
 public void draw(){
 this.theDrawer.setColor(color);
 this.theDrawer.drawRect(x, y, width, height);
 }
 public void draw(Graphics theDrawer){
 this.theDrawer = theDrawer;
 this.theDrawer.setColor(color);
 this.theDrawer.drawRect(x, y, width, height);
 } 
}