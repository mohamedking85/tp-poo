package tp03;
import java.awt.Color;
import java.awt.Graphics;
public class Circle extends Figure{
 int x,y, radius;
 Graphics theDrawer;
 public Circle( int x,int y, int radius){
 this.x = x; this.y =y;
 this.radius = radius;
 }
 public Circle( int x, int y, int radius, Color color){
 this(x,y, radius);
 this.color = color;
 }
 public void setTheDrawer(Graphics theDrawer){
 this.theDrawer = theDrawer;
 }
 public void draw(){
 this.theDrawer.setColor(color);
 this.theDrawer.drawOval(x-radius, y-radius, radius*2, radius*2);
 }
 public void draw(Graphics theDrawer){
 this.theDrawer = theDrawer;
 this.theDrawer.setColor(color);
 this.theDrawer.drawOval(x-radius, y-radius, radius*2, radius*2);
 }
}
