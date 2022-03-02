package chapitre5;

public class main53 {

    public static void main(String[] args) {

        int time = 38920;
        duree(time);

    }
    static void duree(int secondes){
        int heure, minute, reste;

        heure = secondes / 3600;
        minute = (secondes  / 60) % 60;
        reste = secondes % secondes;

        System.out.print(heure +  "h - " +  minute + "m - " + reste + "s");
    }
}
