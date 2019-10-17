package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Set<Integer> courseA = Courses("A",sc);
		Set<Integer> courseB = Courses("B",sc);
		Set<Integer> courseC = Courses("C",sc);
		
		Set <Integer> totalStudents = new TreeSet<>(courseA);
		totalStudents.addAll(courseB);
		totalStudents.addAll(courseC);
		showStudents(totalStudents,"Students of teacher [Alex] : ");
		
		System.out.println("Total students: " + totalStudents.size());
		sc.close();
	}
	
	public static Set<Integer> Courses(String course, Scanner sc){
		
		Set<Integer> cSet = new HashSet<>();
		
		System.out.print("How many students for course " + course + " ? ");
		Integer n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.print("  Enter number student #" + i + " : ");
			Integer student = sc.nextInt();
			cSet.add(student);
		}
		showStudents(cSet,"Students of course [" + course + "] : ");
		
		return cSet;
	}
	
	public static void showStudents(Set <Integer> students, String title) {
		System.out.print(title + "[ ");
		int cont = 1;
		for (Integer s : students) {
			System.out.print((cont > 1) ? " - ":"");
			cont++;
			System.out.print(s);
		}
		System.out.println(" ]");
		System.out.println();
	}
}
