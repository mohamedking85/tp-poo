package maniplist;
import java.util.ArrayList;
import java.util.List;

import simpleio.SimpleIo;
import math.new1.Complex;
import math.new1.Nombre;
import math.new1.Fraction;

public class Main {
 static ArrayList<Nombre>    nList = new ArrayList<Nombre>() ; 
    public static void main(String[] args) {
nList.add(new Fraction(11,13));
nList.add(new Complex(5,8,1));
nList.add(new Complex(19,21,1));
nList.add(new Fraction(31,7));
nList.add(new Fraction(51,5));
nList.add(new Complex(1,7));
nList.add(new Fraction(47,9));
nList.add(new Fraction(11,13));
nList.add(new Complex(5,8));
System.out.println(nList);

}
}