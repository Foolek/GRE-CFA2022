package chapitre5;

public class main54{

    public static void main(String[] args) {

        int heure = 1;
        int minute = 60;
        int seconde = 0;

        int total;
        total = time(heure, minute,seconde);
        System.out.print(total);

    }
    static int time(int heure, int minute, int seconde){

        heure *= 3600;
        minute *= 60;
        return heure + minute + seconde;
    }
}
