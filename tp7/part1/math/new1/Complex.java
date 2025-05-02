package math.new1;
public class Complex extends Nombre {
    public static int f=1;
    private double r, im;
    public Complex() {
        this.r=0.0;
        this.im=1.0;
    }
    public Complex(double r, double im) {
        this.r=r;
        this.im=im;
    }
    public double getR() {
    return r;
    }
    public double getIm() {
        return im;
    }
public void setR(double r){
    this.r=r;
}
public void setIm(double im){
    this.im=im;
}

public String toString(){
    if (f==1) {
        return  this.r + " + i" + this.im ;
    }
    return "("+this.r +","+this.im+")";
    }

    public boolean equals(Object obj) {
       // if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Complex c = (Complex) obj;
        return r == c.r && im == c.im;
    }
}