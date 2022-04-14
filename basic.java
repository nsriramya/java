import java.util.Scanner;

public class srthh {

	public static void main(String[] args) {
		int n,k,x[];
		int c=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	k=sc.nextInt();
	x=new int[n];
	
	for(int i=0;i<n;i++)
	{
		x[i]=sc.nextInt();
		if(x[i]%k!=0)
		{
			c++;
		}
	}
 
		System.out.println(c);
 
		sc.close();
		 
	}

}
