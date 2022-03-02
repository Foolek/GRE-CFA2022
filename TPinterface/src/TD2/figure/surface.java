package TD2.figure;

public interface surface {

    public static double sommeSurface(figure fig[]) {
        double temp = 0;
        for(int i = 0; i < fig.length; i++){
            System.out.println("Somme surface figure " + i + " : " + fig[i].getSurface());
            temp = temp + fig[i].getSurface();
        }

        return temp;
    }

    double getSurface();

    default public int isLargerThan(figure other){
        if (this.getSurface() < other.getSurface()){
            return -1;
        }
        else if (this.getSurface() > other.getSurface()){
            return 1;
        }
        else{
            return 0;
        }
    }
}