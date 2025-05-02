package occurence.objet.tableau1d;
public class Fraction{ 
    int numerateur, denominateur; 
     
    Fraction(){} 
    Fraction(int n, int d){ 
     this.numerateur = n;  
     this.denominateur = d; 
    } 
    public boolean equals(Fraction f){ 
     if ((this.numerateur == f.numerateur)  && (this.denominateur == f.denominateur)) 
      return true; 
     return false; 
    } 
    public String toString(){ 
     return this.numerateur + "/" + this.denominateur; 
    } 
   } 