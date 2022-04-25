package TD4_5_6.Point;

import java.util.Comparator;

public class ComparePointY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        return (o1.getY() - o2.getY());
    }
}
