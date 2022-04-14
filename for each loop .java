import java.util.Scanner;

public class srthh {

	public static void main(String[] args) {
		int n,k,x[];
		int s=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	 
	x=new int[n];
	
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
//		System.out.println(x[i]+" ");
		 
		 
	}
	for(int i:x)
	{
		System.out.print(i+" ");
		s=s+i;
	}
 
		System.out.println(s+" ");
 
		sc.close();
		 
	}

}
