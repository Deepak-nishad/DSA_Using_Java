package merging;

import java.util.Scanner;

public class Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[] = {2,4,7,10};
		int b[]= {2,2,3,4};
		
		
		int n=a.length;
		int m=b.length;
		
		int [] c=new int [n+m];
		
		for(int i=0;i<n+m;i++) {
			c[i]=sc.nextInt();
		}
		
	}

}
