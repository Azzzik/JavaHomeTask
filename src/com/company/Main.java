package com.company;
import java.util.Scanner;

import java.lang.String;

public class Main {

    public static void main(String[] args) {
	// write your code here
Scanner input = new Scanner(System.in);
int b;
int[] arr = new int[10];
        int i=0;
System.out.println("Input your integers, than press '='");
        while (true) {
            String a = input.nextLine();
            if(a.equals("=")){break;}else {  b = Integer.parseInt(a);}

            arr[i]=b;
            i++;

        }

        //java.util.Collections.sort(arr);


        System.out.println(arr);
    }
}

