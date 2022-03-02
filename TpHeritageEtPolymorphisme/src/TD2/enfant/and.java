package TD2.enfant;

public class and extends ConnecteurBinaire {
    public and(boolean a, boolean b){
        a = set_entree1(a);
        b = set_entree2(b);
    }

    @Override
    public boolean sortie() {
        return get_entree1() & get_entree2();
    }

}