package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
Scanner num = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while(true) {
            int a = num.nextInt();

            if(instanceof(a)==Integer){arr.add(a);}else break;

        }
        System.out.println(arr);
    }
}

