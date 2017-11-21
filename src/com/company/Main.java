package com.company;
import java.util.ArrayList;
import java.util.Scanner;

import java.lang.String;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*Scanner input = new Scanner(System.in);
int b;
ArrayList<Integer> list = new ArrayList<>();

System.out.println("Input your integers, than press '='");
        while (true) {
            String a = input.nextLine();
            if(a.equals("=")){break;}else {  b = Integer.parseInt(a);}

          list.add(b);


        }

        //java.util.Collections.sort(arr);
NameSorter.getSorted(list);

        System.out.println(list);*/
Student stud0 = new Student();
stud0.setName("Vasil Vasilenko");
stud0.setBirthDate("16.07.1991");
stud0.setGender('M');
stud0.setMajor(Student.Major.COMPUTER_SCIENECE);
    }
}

