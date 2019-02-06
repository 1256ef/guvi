import java.util.*;
import java.lang.*;
import java.io.*;
class ideone
{
	public static void main(String[]args)
	{
		int a;
		Scanner S=new Scanner(System.in);
		System.out.println("");
		a=S.nextInt();
		if(a<0)
		{
			System.out.println("invalid");
		}
		else if(a>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
}
}
