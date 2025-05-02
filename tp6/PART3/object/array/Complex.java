package object.array;
public class Complex { 
 double r; // Partie réelle 
     double i; // Partie Imaginaire 
 public Complex(){}   // Constructeur par défaut 
 public Complex(double r, double i){  // 2ème constructeur 
  this.r = r; 
  this.i = i; 
 } 
 public boolean equals(Complex c){ 
  if (this.r == c.r && this.i == c.i ) 
   return true; 
  return false; 
 } 
    public String toString(){ 
  return "("+ this.r + "," + this.i +")"; 
 } 
} 