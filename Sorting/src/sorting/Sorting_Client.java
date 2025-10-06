package sorting;

import java.util.Scanner;

public class Sorting_Client {

	public static void main(String[] args) {
		
		All_Sorting_Algo obj=new All_Sorting_Algo();
		
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		obj.getValueInArray(size);
		

		obj.bubble_Sort();
		obj.print();
		

	}

}
