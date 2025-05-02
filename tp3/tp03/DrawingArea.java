package tp03;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawingArea extends JPanel {
Drawings dlv;
public DrawingArea(Drawings dlv){
 this.dlv = dlv;
}
 
 public void paint(Graphics g){
 for(Figure f:dlv.figureList)
 f.draw(g);
 }
}