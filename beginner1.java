    import java.io.*;
    import java.util.Scanner;
    class Ideone
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		
    		Scanner sc=new Scanner(System.in);
    		int input=sc.nextInt();
    		if(input==0)
    		System.out.println("Zero");
    		if(input<0)
    		System.out.println("Negative");
    		if(input>0)
    		System.out.println("Positive");
    	}
    }
