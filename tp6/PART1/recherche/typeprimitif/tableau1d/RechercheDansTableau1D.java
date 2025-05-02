package recherche.typeprimitif.tableau1d;
import simpleio.SimpleIo;
public class RechercheDansTableau1D{
    public static void main(String[] args) {
   int [] tabint={13,15,89,55,13,45,3,45,14,100};

   SimpleIo.print("enter val: ");
int val=SimpleIo.readInt();
int res=rechEntier(tabint,val);
if(res==-1){
SimpleIo.println(val + " doesn't exist");
//SimpleIo.gDisplay(val + " doesn't exist");

}else{
    //SimpleIo.gDisplay("La valeur val "+ val + " se trouve dans la case d'indice "+res);
    SimpleIo.println("La valeur val "+ val + " se trouve dans la case d'indice "+res);
}

    }
public static int rechEntier (int [] tabint, int val){
for(int i=0;i<tabint.length;i++){
    if (val==tabint[i]) {
        return i+1;
    }
}
    return -1;
}
}
