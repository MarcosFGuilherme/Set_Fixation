package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Set<Integer> courseA = Courses("A",sc);
		Set<Integer> courseB = Courses("B",sc);
		Set<Integer> courseC = Courses("C",sc);
		
		System.out.println("Total students: ");
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
		System.out.print("Students of course [" + course + "] : [ ");
		int cont = 1;
		for (Integer s : cSet) {
			System.out.print((cont > 1) ? " - ":"");
			cont++;
			System.out.print(s);
		}
		System.out.println(" ]");
		System.out.println();
		
		return cSet;
	}

}
