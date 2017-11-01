package com.company;



public class NameSorter {
    public static void getSorted(int [] a){
for (int i =0; i < a.length;i++){
    int e = a[i];
    int ins = i;
    while(ins>0 && a[ins-1]>e){
        a[ins] = a [ins-1];
        ins--;
        a[ins]=e;
    }
}




    }
}
