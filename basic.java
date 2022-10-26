import java.io.*;
import java.util.*;

class Sample{
	public static void main(String args[]){
		Scanner sc=nre Scanner(System.in);
		int n;
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The entered elements are : ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
