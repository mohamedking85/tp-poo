package tp03;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;
public class Drawings {
 public ArrayList<Figure> figureList = new ArrayList<Figure>();
 public Graphics theDrawer;
 public Drawings(){ }
 public Drawings(ArrayList<Figure> figures) {
    this.figureList = figures;
}
 public Drawings(Figure[] tabFigure){
 for (Figure f:tabFigure) figureList.add(f);
 }
 public void addRectangle(int x, int y, int height, int width,Color col){
 figureList.add(new Rectangle(x,y,height,width,col));
 }
 public void addCircle(int x, int y, int radius, Color col){
 figureList.add(new Circle(x,y,radius, col));
 }

 public void addRectangeconst(int x1,int y1,int n,int width,int height,int space,Color col){
    figureList.add(new Rectangeconst(x1,y1,width,height,space,n, col));
    }


 public void deleteRectangle(int x, int y, int width, int height) {
    for (int i = 0; i < figureList.size(); i++) {
        Figure fig=figureList.get(i);
        if (fig instanceof Rectangle) {
 Rectangle r = (Rectangle) fig;
            if (r.x == x && r.y == y && r.width == width && r.height == height) {
                figureList.remove(i); 
            return;
            }
        }
    }
}


}
