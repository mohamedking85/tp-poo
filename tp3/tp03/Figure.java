package tp03;
import java.awt.Color;
import java.awt.Graphics;
public class Figure {
 int id;
 Color color = Color.BLACK;
 public void setColor(Color color){
 this.color = color;
 }
 
 public void draw(){};
 public void draw(Graphics theDrawer){};
}