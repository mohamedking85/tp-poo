package graphics.base;

public class Point2d extends Point {
    private int x;
    private int y;

    public  Point2d(){

    }
    public Point2d(int x,int y){
this.x=x;
this.y=y;
    }

    public String toString(){
        return "(x= "+this.x+" y= "+this.y+")";
    }

  //  public void setx(){this.x=x;}
  //  public void sety(){this.y=y;}
}