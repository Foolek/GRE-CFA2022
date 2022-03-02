package TD2.enfant;

import TD2.enfant.and;
import TD2.enfant.or;

public abstract class ConnecteurBinaire{
    private boolean a;
    private boolean b;

    public ConnecteurBinaire(){
        this.a = true;
        this.b = true;
    }

    public abstract boolean sortie();

    public boolean get_entree1(){return a;}
    public boolean get_entree2(){return b;}


    public boolean set_entree1(boolean a){this.a = a; return a;}
    public boolean set_entree2(boolean b){this.b = b; return b;}

}
