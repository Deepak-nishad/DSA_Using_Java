package sorting;

import java.util.Scanner;

public class All_Sorting_Algo {
	
	private int arr[];
	private int size;
	
	public All_Sorting_Algo() {
		this.size=5;
		arr=new int[size];
		
	}
	
	public void getValueInArray(int size) {
		this.size=size;
		arr=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value is arrays :: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
	}
	
	public void  bubble_Sort() {
		
		int cnt=0;
		for(int i=0;i<size;i++) {
			System.out.println("Passes "+ i);
			for(int j=0;j<size-1-i;j++) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				cnt++;
				}
				print();
			}
		
		}
		
	System.out.println("Total no of swapping "+ cnt);
		
	}
	
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

}
