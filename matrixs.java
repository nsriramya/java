import java.util.*;

public class srthh {

	public static void main(String[] args) {
		int  c,r;
		 int s1=0,s2=0;
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][];
		a=new int[r][c];

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					s1=s1+a[i][j];	
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i+j==(r-1))
				{
					s2=s2+a[i][j];
				}
			}
		}
		System.out.println(Math.abs(s1-s2));
	}
}
