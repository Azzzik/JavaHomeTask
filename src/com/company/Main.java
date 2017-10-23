package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
	// write your code here
Scanner input = new Scanner(System.in);
int b;
ArrayList<Integer> arr = new ArrayList<>();
System.out.println("Input your integers, than press '='");
        while (true) {
            String a = input.nextLine();
            if(a.equals("=")){break;}else {  b = Integer.parseInt(a);}

            arr.add(b);

        }
        System.out.println(arr);
    }
}

