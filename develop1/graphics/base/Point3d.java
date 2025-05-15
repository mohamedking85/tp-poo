package graphics.base;
public class Point3d extends Point{
    private int x;
    private int y;
    private int z;
    public  Point3d(){

    }
    public Point3d(int x,int y,int z){
this.x=x;
this.y=y;
this.z=z;
    }

    public String toString(){
        return "(x= "+this.x+" y= "+this.y+ " z= "+this.z+")";
    }
 //   public void setx(){this.x=x;}
  //  public void sety(){this.y=y;}
  //  public void setz(){this.z=z;}
}
