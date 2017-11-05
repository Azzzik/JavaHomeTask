package com.company;

import java.util.Comparator;

public abstract class NameComparator implements Comparator<Student> {

    public int compare(Student obj1, Student obj2) {

        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }


}
