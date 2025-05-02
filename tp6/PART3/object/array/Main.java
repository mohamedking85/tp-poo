package  object.array;
import  object.array.Complex;
import  object.array.Fraction;
import simpleio.SimpleIo;
public class Main{
public static void main(String[] args) {
Complex tabComp1[][]={{new Complex(1.2,1.5),new Complex(2.1,2.3),new Complex(3.8,3.9)},    {new Complex(0.2,0.5),new Complex(1.1,1.3)}    ,    { new Complex(1.2,1.5),new Complex(2.1,2.3),new Complex(3.8,3.9),new Complex(8.8,9.9) },    {new Complex(1.2,1.5)}    ,{new Complex(1.2,1.5),new Complex(2.1,2.3)}};
display2DComplexArray(tabComp1,"tabComp1");
Complex tabComp2[][]={{new Complex(1.2,1.5)},null,{new Complex(1.2,1.5),new Complex(2.1,2.3),new Complex(3.8,3.9),new Complex(8.8,8.9)},{}};
display2DComplexArray(tabComp2,"tabComp2");
Complex tab=new complex();


}





public static void display2DComplexArray(Complex table[][],String t){
    int c=0;
    SimpleIo.print("\nNombre de ligne du tableau "+ t+ " "+ table.length);
    for(int i=0;i<table.length;i++){
        SimpleIo.print("\nligne: "+ (i+1));
        if (table[i]==null) {
            SimpleIo.print(" N'existe pas ");
        }else if(table[i].length==0){
            SimpleIo.print(" La ligne ne contient aucun element. La taille de la ligne est egale à 0.");
        }else{
            SimpleIo.print( " taille: "+table[i].length+ " element: ");
            for(Complex tab:table[i]){
            SimpleIo.print("   " + tab);
            c++;
            }
        }
    }
    SimpleIo.println("\nNombre total d'éléments du tableau display2DComplexArray :"+c+"");

    }
















}