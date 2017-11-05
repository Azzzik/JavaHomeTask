package com.company;

import java.util.Date;

public class Student {
    private String name;
    private String birthDate;
    private enum major {MATH, COMPUTER_SCIENECE, LITERATURE, NATURAL_HISTORY}
    private char gender;

    public String getName(){return name;}
    public String getBirthDate(){return birthDate;}
    public char getGender(){return gender;}
}