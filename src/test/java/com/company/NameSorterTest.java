package com.company;

import static com.company.Student.Major.COMPUTER_SCIENCE;
import static com.company.Student.Major.NATURAL_HISTORY;

import java.util.ArrayList;
import java.util.Comparator;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class NameSorterTest {
	
	private NameLenghtSorter nameSorter;
	
	@Before
	public void setUp() {
		nameSorter = new NameLenghtSorter();
		Comparator<Student> nameLengthComparator = Mockito.mock(Comparator.class);
		Mockito.when(nameLengthComparator.compare(Mockito.any(Student.class), Mockito.any(Student.class))).thenReturn(0);
		nameSorter.setNameLengthComparator(nameLengthComparator );
	}
	
	@Test
	public void shouldSort() {
		ArrayList<Student> students = new ArrayList<>();
		Student stud1 = new Student();
        stud1.setName("Vasylyna Vasiliva");
        stud1.setBirthDate("13.08.1990");
        stud1.setGender('F');
        stud1.setMajor(NATURAL_HISTORY);
        students.add(stud1);
        System.out.println(stud1.getName().length());

        Student stud2 = new Student();
        stud2.setName("Ivan Ivaniv");
        stud2.setBirthDate("26.11.1991");
        stud2.setGender('M');
        stud2.setMajor(Student.Major.MATH);
        students.add(stud2);
        System.out.println(stud2.getName().length());

        Student stud3 = new Student();
        stud3.setName("Ivanna Ivanova");
        stud3.setBirthDate("13.06.1992");
        stud3.setGender('F');
        stud3.setMajor(Student.Major.LITERATURE);
        students.add(stud3);
        System.out.println(stud3.getName().length());

        Student stud4 = new Student();
        stud4.setName("Dmytro Dmytrenko");
        stud4.setBirthDate("01.01.1991");
        stud4.setGender('M');
        stud4.setMajor(COMPUTER_SCIENCE);
        students.add(stud4);
        System.out.println(stud4.getName().length());
		
		nameSorter.getSorted(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				Integer str1 = o1.getName().length();
		        Integer str2 = o2.getName().length();

		        return str2.compareTo(str1);
			}
		});
		
		Assertions.assertThat(students).containsSequence(stud2, stud3, stud4, stud1);
	}

}
