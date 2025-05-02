package occurence.objet.tableau1d;
import occurence.objet.tableau1d.Complex;
import occurence.objet.tableau1d.Fraction;
import simpleio.SimpleIo;
public class Arraymanip {
    public static void main(String[] args) {
int tabin1[]={5,6,7,12,9,12,12,11};
int tabin2[]={13,14,15,16,17,18,19,20,19,25,15,34};
Fraction tabfrac1[]={new Fraction(5,7),new Fraction(5,7),new Fraction(15,16),new Fraction(1,5),new Fraction(6,3)};
Fraction tabfrac2[]={new Fraction(3,2),new Fraction(1,6),new Fraction(8,4)};
Complex tabcomp1[]={new Complex(10.3,5.5),new Complex(1.5,6.3),new Complex(10.3,5.5),new Complex(7,6),new Complex(8,7)};
Complex tabcomp2[]={new Complex(3,1),new Complex(1,3),new Complex(4,4)};
int v1=12;
//table 1
int count=occurence(tabin1, v1);
if (count!=-1 && count!=0){
    SimpleIo.println("Le nombre de fois que la valeur "+ v1 +" apparait dans le tableau tabInt1 est: " +count );
//}else if(count==-1){
   // SimpleIo.println("the table is empty");
}else{
    SimpleIo.println("Aucune occurrence trouvée de la valeur- " + v1 + " dans le tableau tabInt1 \n");
}
//table 2
v1=7;
count=occurence(tabin2, v1);
if (count!=-1 && count!=0){
    SimpleIo.println("Le nombre de fois que la valeur "+ v1 +" apparait dans le tableau tabInt2 est: " +count );
//}else if(count==-1){
//    SimpleIo.println("the table is empty");
}else{
    SimpleIo.println("Aucune occurrence trouvée de la valeur " + v1 + " dans le tableau tabInt2 \n");
}

//table 3

Complex v2=new Complex(10.3,5.5);
count=occurence(tabcomp1, v2);
if (count!=-1 && count!=0){
    SimpleIo.println("Le nombre de fois que la valeur "+ v2 +" apparait dans le tableau tabcomp1 est: " +count );
  //  }else if(count==-1){
    //    SimpleIo.println("the table is empty");
    }else{
        SimpleIo.println("Aucune occurrence trouvée de la valeur " + v2 + " dans le tableau tabcomp1 \n");
    }
//table 4
    v2=new Complex(6.6,5.5);
    count=occurence(tabcomp2, v2);
    if (count!=-1 && count!=0){
        SimpleIo.println("Le nombre de fois que la valeur "+ v2 +" apparait dans le tableau tabcomp2 est: " +count );
      //  }else if(count==-1){
        //    SimpleIo.println("the table is empty");
        }else{
            SimpleIo.println("Aucune occurrence trouvée de la valeur " + v2 + " dans le tableau tabcomp2 \n");
        }

//table 5

Fraction v3=new Fraction(5,7);
count=occurence(tabfrac1, v3);
if (count!=-1 && count!=0){
    SimpleIo.println("Le nombre de fois que la valeur "+ v3.numerateur+"/"+v3.denominateur +" apparait dans le tableau tabfrac1 est: " +count );
        //}else if(count==-1){
          //  SimpleIo.println("the table is empty");
        }else{
            SimpleIo.println("Aucune occurrence trouvée de la valeur " + v3 + " dans le tableau tabfrac \n");
        }

//table 6

v3=new Fraction(15,8);
count=occurence(tabfrac2, v3);
if (count!=-1 && count!=0){
    SimpleIo.println("Le nombre de fois que la valeur "+ v3.numerateur+"/"+v3.denominateur +" apparait dans le tableau tabfrac2 est: " +count );
        //}else if(count==-1){
          //  SimpleIo.println("the table is empty");
        }else{
            SimpleIo.println("Aucune occurrence trouvée de la valeur " + v3 + " dans le tableau tabfrac2 \n");
        }


}


public static int occurence(int table[],int val){
if (table==null || table.length==0) {
    return -1;
}else{
    int c=0;
    for(int tab:table){
        if (val==tab) {
            c++;
        }
    }
    return c;

}
}

public static int occurence(Fraction table[],Fraction val){
    if (table==null || table.length==0) {
        return -1;
    }else{
        int c=0;
        for(Fraction f:table){
            if (f.equals(val)) {
                c++;
            }
        }
        return c;
    }
    }

    public static int occurence(Complex table[],Complex val){
        if (table==null || table.length==0) {
            return -1;
        }else{
            int c=0;
            for(Complex tab:table){
                if (val.i==tab.i && val.r==tab.r) {
                        c++;  
                }
            }
            return c;
        }        
        }

}
