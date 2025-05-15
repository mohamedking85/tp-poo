package maniparray.vector;
import java.lang.reflect.Array;
import java.util.ArrayList;

import graphics.base.Point;
import graphics.base.Point2d;
import graphics.base.Point3d;

 public class ManipArray {

public static void printarray(Point p[]){
    int i;
System.out.println("la tableau de point est egale "+p.length);
for (i=0;i<p.length;i++){
System.out.print("index "+i+": ");
if(p[i]==null){
    System.out.println("aucun point");
}else{
System.out.println(p[i].toString());
}

}





 }
 }