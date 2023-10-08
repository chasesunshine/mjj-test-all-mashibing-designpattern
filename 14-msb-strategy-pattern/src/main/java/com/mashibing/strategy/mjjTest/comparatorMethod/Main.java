package com.mashibing.strategy.mjjTest.comparatorMethod;

import com.mashibing.strategy.mjjTest.comparatorMethod.comparator.CatHeightComparator;
import com.mashibing.strategy.mjjTest.comparatorMethod.comparator.CatWeightComparator;
import com.mashibing.strategy.mjjTest.comparatorMethod.comparator.Comparator;

import java.util.Arrays;

/**
 * writing tests first!
 * extreme programming
 */
public class Main {
    public static void main(String[] args) {
        //int[] a = {9, 2, 3, 5, 7, 1, 4};
        Cat[] a = {new Cat(3, 5), new Cat(5, 1), new Cat(1, 3)};
        //Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a, (o1, o2)->{
            if(o1.weight < o2.weight) return -1;
            else if (o1.weight>o2.weight) return 1;
            else return 0;
        });
        System.out.println(Arrays.toString(a));

        Comparator catWeightComparator = new CatWeightComparator();
        sorter.sort(a,catWeightComparator);
        System.out.println(Arrays.toString(a));

        Comparator catHeightComparator = new CatHeightComparator();
        sorter.sort(a,catHeightComparator);
        System.out.println(Arrays.toString(a));

    }
}
