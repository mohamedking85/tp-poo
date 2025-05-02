package tp03;
import java.awt.Graphics;

import java.awt.Color;

public class Rectangeconst extends Figure {
    int x1,y1,width,height,space,n;
    Graphics theDrawer;
    public Rectangeconst(int x1,int y1,int width,int height,int space,int n,Color col){
        this.x1=x1;
        this.y1=y1;
        this.width=width;
        this.n=n;
        this.height=height;
        this.space=space;


    }
public Rectangeconst(int x1,int y1,int width,int height,int space, int n){
    
this.x1=x1;
this.y1=y1;
this.width=width;
this.n=n;
this.height=height;
this.space=space;
this.color=color;
    }
    public void setTheDrawer(Graphics theDrawer){
        this.theDrawer = theDrawer;
        }

        public void draw(){

            for(int i=1;i<n;i++){
                this.theDrawer.setColor(color);
                this.theDrawer.drawRect(x1+space*i ,y1+space*i  ,width*i,height*i);
        }
    }

    public void draw(Graphics theDrawer){
        this.theDrawer = theDrawer;
int x=x1;
int y=y1;
int h=height;
int w=width;
    for(int i=1;i<n+1;i++){
    this.theDrawer.setColor(color);
    this.theDrawer.drawRect(x,y,w,h);
    x=x-space;
    y=y-space;
    h=h+2*space;
    w=w+space*2;
    }

}
}