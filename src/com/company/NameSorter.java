package com.company;


import java.util.ArrayList;

public class NameSorter {
    public static void getSorted( ArrayList<Integer> arr){
for (int i =0; i < arr.size();i++){
    int elem = arr.get(i);
    int ins = i;
    while(ins>0 && arr.get(ins-1)>elem){
        arr.set(ins, arr.get (ins-1) );
        ins--;
        arr.set(ins, elem);
    }
}




    }
}
