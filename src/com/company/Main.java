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
<<<<<<< HEAD
        //java.util.Collections.sort(arr);

=======


        //java.util.Collections.sort(arr);
>>>>>>> 2ec166497a63df2defbe7141d3988d22c8db5770

        System.out.println(arr);
    }
}

