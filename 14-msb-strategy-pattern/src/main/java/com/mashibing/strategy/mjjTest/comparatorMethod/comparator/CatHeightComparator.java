package com.mashibing.strategy.mjjTest.comparatorMethod.comparator;

import com.mashibing.strategy.mjjTest.comparatorMethod.Cat;

public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.height < o2.height) return -1;
        else if (o1.height > o2.height) return 1;
        else return 0;
    }
}
