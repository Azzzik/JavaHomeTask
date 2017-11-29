package com.company;


public class Student {
    private String name;
    private String birthDate;
    public enum Major {MATH, COMPUTER_SCIENCE, LITERATURE, NATURAL_HISTORY}
    private char gender;
    public Major major;

    public String getName(){return name;}
    public String getBirthDate(){return birthDate;}
    public char getGender(){return gender;}
    public Major getMajor(){return major;}

    public void setName(String sname){name=sname;}
    public void setBirthDate(String sbirthdate){birthDate=sbirthdate;}
    public void setGender(char cgender){gender=cgender;}
    public void setMajor(Major emajor){major=emajor;}

    public String introduce(){

        if(getName()==null)throw new IllegalArgumentException("Name equals null");
        return "Hi, my name is "+getName()+", I was born "+ getBirthDate()+", I’m a student and my major is "+getMajor();}

}

