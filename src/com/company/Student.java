package com.company;

import java.util.Date;

public class Student {
    private String name;
    private String birthDate;
    public enum Major {MATH, COMPUTER_SCIENECE, LITERATURE, NATURAL_HISTORY}
    private char gender;
    private Major major;

    public String getName(){return name;}
    public String getBirthDate(){return birthDate;}
    public char getGender(){return gender;}
    public Major getMajor(){return major;}

    public void setName(String sname){name=sname;}
    public void setBirthDate(String sbirthdate){birthDate=sbirthdate;}
    public void setGender(char cgender){gender=cgender;}
    public void setMajor(Major emajor){major=emajor;}
}