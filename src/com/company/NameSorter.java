package com.company;


import java.util.ArrayList;
import java.util.Comparator;

public class NameSorter {
    public static void getSorted(ArrayList<Student> arr, Comparator comp){
for (int i =1; i < arr.size();i++){

    int ins = i;
    Student elem = arr.get(i);
    Student elem1= arr.get(ins-1);

    while(ins>0 && comp.compare(elem,elem1)>=0 /*arr.get(ins-1)>elem*/){
        arr.set(ins, arr.get (ins-1) );
        ins--;
        arr.set(ins, elem);
    }
}




    }
}
