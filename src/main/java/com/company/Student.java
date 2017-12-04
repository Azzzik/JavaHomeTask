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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + gender;
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (gender != other.gender)
			return false;
		if (major != other.major)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

    
}

