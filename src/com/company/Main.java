package com.company;
import java.util.*;

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
stud0.setMajor(Student.Major.COMPUTER_SCIENCE);

        Student stud1 = new Student();
        stud1.setName("Vasylyna Vasiliv");
        stud1.setBirthDate("13.08.1990");
        stud1.setGender('F');
        stud1.setMajor(NATURAL_HISTORY);

        Student stud2 = new Student();
        stud2.setName("Ivan Ivaniv");
        stud2.setBirthDate("26.11.1991");
        stud2.setGender('M');
        stud2.setMajor(Student.Major.MATH);

        Student stud3 = new Student();
        stud3.setName("Ivanna Ivanova");
        stud3.setBirthDate("13.06.1992");
        stud3.setGender('F');
        stud3.setMajor(Student.Major.LITERATURE);

        Student stud4 = new Student();
        stud4.setName("Dmytro Dmytrenko");
        stud4.setBirthDate("01.01.1991");
        stud4.setGender('M');
        stud4.setMajor(Student.Major.COMPUTER_SCIENCE);

        Student stud5 = new Student();
        stud5.setName("Jaryna Jarova");
        stud5.setBirthDate("19.12.1990");
        stud5.setGender('M');
        stud5.setMajor(Student.Major.MATH);

        ArrayList<Student> list = new ArrayList<>();

        list.add(stud0);
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);
        list.add(stud5);

        System.out.println(list);
        Comparator comp = new NameComparator() {};

        NameSorter.getSorted(list,comp);

        System.out.println(list);

        Map students = new HashMap< Student.Major, Student>();
        students.put(stud0.getMajor(),stud0);
        students.put(stud1.getMajor(),stud1);
        students.put(stud2.getMajor(),stud2);
        students.put(stud3.getMajor(),stud3);



        System.out.println(students.get());

        
    }
}

