import java.util.Comparator;

public class ComparatorByCost implements Comparator<Jewel> {

    @Override
    public int compare(Jewel o1, Jewel o2) {
        return Integer.compare(o1.getTotalCost(), o2.getTotalCost());
    }
}