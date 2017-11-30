package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class NewNameSorter {
    public static void getSorted(ArrayList<Integer> arr, Comparator comp) {

        for (int i = 0; i < arr.size(); i++) {
            int elem = arr.get(i);
            int ins = i;
            while (ins > 0 && comp.compare(ins, ins+1)<0) {
                arr.set(ins, arr.get(ins - 1));
                ins--;
                arr.set(ins, elem);
            }
        }
    }
}
