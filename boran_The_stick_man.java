package yesnt;
	import java.util.Scanner;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.PrintStream;
	public class boran_The_stick_man  {
	
		public static void main(String[] args) throws FileNotFoundException{
		PrintStream fileWriter=new PrintStream ("test.txt");	
	File file=new File("test.txt");
	Scanner fileReader=new Scanner(file);
	Scanner input=new Scanner(System.in);
	fileWriter.print("Chisla na fobunachi");
	
	
		System.out.print("n=");
		int n=input.nextInt();
		int i=1;
		System.out.print("1");
		for (i=1;i<n;i++)
		{int k=fobunachi (i);
		fileWriter.print(" "+k);}}
		public static int fobunachi (int n)
		{
			{if (n==1 || n==0)
			return 1;
		else 
			return fobunachi(n-1)+fobunachi(n-2);}
	}

}
