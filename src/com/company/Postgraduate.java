package com.company;

public class Postgraduate extends Student {

    private String graduate;
    public void setGraduate(String grad){graduate=grad;}
    public String getGraduate(){return graduate;}


    @Override

    public String introduce(){return "Hi, my name is "+getName()+", I was born "+ getBirthDate()+", I’m a student and my major is "+getMajor()+ " And i was graduate "+getGraduate();}

}
