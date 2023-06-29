class Even_Odd
{
			public static void main(String []args)
		{
			int a;
			a=Integer.parseInt(args[0]);
			if(a%2==0)
				System.out.println("The number is Even"+args[0]);
			else
				System.out.println("The number is Odd"+args[0]);
		}
}