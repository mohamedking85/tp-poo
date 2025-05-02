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
nList.add(new Complex(5,8));
nList.add(new Complex(19,21));
nList.add(new Fraction(31,7));
nList.add(new Fraction(51,5));
nList.add(new Complex(1,7));
nList.add(new Fraction(47,9));
nList.add(new Fraction(11,13));
nList.add(new Complex(5,8));

Class cx1 =  nList.getClass(); 

SimpleIo.print(nList);

Complex n1=new Complex(5,8);
//Complex.f=2;
SimpleIo.print(nList);
SimpleIo.println("\nthe number of "+n1+" in nlist is " + numberOfInstance(nList,n1));

Fraction n2=new Fraction(11,13);
SimpleIo.println("the number of "+n2+" numbers in nlist is " +numberOfInstance(nList,n2));
System.out.println(n2.getDeno());
    }



    public static int numberOfInstance(ArrayList<Nombre> nlist, Nombre n2s) {
      int i = 0;
      for (Nombre n1 : nlist) {
        if (n1.getClass()==n2s.getClass()) {
          if (n1.equals(n2s)) {
            i++;
        }
        }
      }
      return i;
    }
  }