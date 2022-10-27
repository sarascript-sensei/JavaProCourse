package Lesson9;

import java.util.Comparator;

public class MaxPriceComparator implements Comparator<LuxuryCars> {
    @Override
    public int compare(LuxuryCars o1, LuxuryCars o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
