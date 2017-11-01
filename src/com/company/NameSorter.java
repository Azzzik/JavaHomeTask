package com.company;


import java.util.ArrayList;

public class NameSorter {
    public static void getSorted( ArrayList<Integer> a){
for (int i =0; i < a.size();i++){
    int e = a.get(i);
    int ins = i;
    while(ins>0 && a.get(ins-1)>e){
        a.get(ins) = a.get (ins-1);
        ins--;
        a.get(ins)=e;
    }
}




    }
}
