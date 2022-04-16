package ram;

public class javaa {
	public void add(int n1,int n2)
	{
		System.out.println(n1+n2);
	}
	
	public int add(int n1,int n2,int n3)
	{
		 int res = n1 + n2 + n3; 
		 return res;
	}
	 
	public static void main(String args[]) 
	{
		javaa ob=new javaa();
		ob.add(1, 2);
		int r = ob.add(1,2,3);
		System.out.print(r);
	}
	
}

