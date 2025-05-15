package test;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import graphics.base.Point;
import graphics.base.Point2d;
import graphics.base.Point3d;
import maniparray.vector.ManipArray;
public class Test2{
static Point tabclass[]={
    new Point2d(10, 20),
    new Point3d(11, 15, 30),
    new Point2d(5, 10) ,
    new Point2d(20, 40),
    new Point3d(11,15,30),
    new Point2d(5, 10)
};
    public static void main(String[] args) {

        ManipArray.printarray(tabclass); 
        
        
        tabclass[2]=null;
        System.out.println("suppression du point d'indice 2");
        tabclass[4]=null;
        System.out.println("suppression du point d'indice 4");
        System.out.println("le nombre dans la tableau est maintenant de 4");
        ManipArray.printarray(tabclass);  



}

}