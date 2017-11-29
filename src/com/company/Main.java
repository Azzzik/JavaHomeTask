package com.company;
import java.util.*;

import java.lang.String;

import static com.company.Student.Major.COMPUTER_SCIENCE;
import static com.company.Student.Major.NATURAL_HISTORY;


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
stud0.setMajor(COMPUTER_SCIENCE);

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
        stud4.setMajor(COMPUTER_SCIENCE);

        Student stud5 = new Student();
        stud5.setName("Jaryna Jarova");
        stud5.setBirthDate("19.12.1990");
        stud5.setGender('F');
        stud5.setMajor(Student.Major.MATH);

        Postgraduate post0 = new Postgraduate();
        post0.setName("Stanislav Stasiv");
        post0.setBirthDate("16.07.1991");
        post0.setGender('M');
        post0.setMajor(Student.Major.NATURAL_HISTORY);
        post0.setGraduate("24.06.2013");

        Postgraduate post1 = new Postgraduate();
        post1.setName("Roman Romaniv");
        post1.setBirthDate("17.09.1992");
        post1.setGender('M');
        post1.setMajor(Student.Major.MATH);
        post1.setGraduate("24.06.2013");

        Postgraduate post2 = new Postgraduate();

        post2.setBirthDate("23.04.1992");
        post2.setGender('F');
        post2.setMajor(Student.Major.COMPUTER_SCIENCE);
        post2.setGraduate("24.06.2013");
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
        students.put(stud0.major,stud0);
        students.put(stud1.getMajor(),stud1); //Doesn't work in that way, do not forget to ask
        students.put(stud2.getMajor(),stud2);
        students.put(stud3.getMajor(),stud3);

        HashSet<Student> studentsSet = new HashSet<>();

        studentsSet.add(stud0);
        studentsSet.add(stud1);
        studentsSet.add(stud2);
        studentsSet.add(stud3);
        studentsSet.add(stud4);
        studentsSet.add(stud5);
        studentsSet.add(post0);
        studentsSet.add(post1);
        studentsSet.add(post2);






        System.out.println(students.get(COMPUTER_SCIENCE));
        System.out.println(stud0.introduce());
        System.out.println(post0.introduce());

        Iterator<Student> iter = studentsSet.iterator();
        while(iter.hasNext()){

            Student tstud = iter.next();
            System.out.println(tstud.introduce());
        }
        
    }
}

