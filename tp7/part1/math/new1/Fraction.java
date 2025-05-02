package math.new1;
public class Fraction extends Nombre {
    private int num,deno;
    public Fraction() {
        this.num=0;
        this.deno=1;
    }
    public Fraction(int num, int deno) {
        this.num=num;
        this.deno=deno;
    }
    public int getNum() {
    return num;
    }
    public int getDeno() {
        return deno;
    }
public void setNum(int num){
    this.num=num;
}
public void  setDeno(int deno){
    this.deno=deno;
}

public String toString(){
    return this.num + "/" + this.deno;
    }

    public boolean equals(Object obj) {
        Fraction f = (Fraction) obj;
        if  (num == f.num && deno == f.deno) {
            return true;
        }
        if (getClass() != obj.getClass()) {return false;
        }
    return false;
    }


    }

