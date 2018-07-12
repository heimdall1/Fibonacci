public class fibonacci
{
	public static void main(String[] args)
	{
		int f0 = 0;
		int f1 = 1;
		int help = 0;
		int cantidad = 15;

		int[] res;
		res = new int[cantidad];

		for (int i = 0; i< cantidad ; i++)
		{
			System.out.println("valor pos: " + (i+1));
			System.out.println("-------------");
			if(i== 0)
			{
				res[i] = 0;
			}
			else if (i == 1) 
			{
				res[i] = 1;
			}
			else
			{
				res[i] = res[i-2] + res[i-1];
				System.out.println("Valor f-1: " + res[i-1]);
				System.out.println("Valor f-2: " + res[i-2]);
			
			}
			System.out.println("valor res: " + res[i]);
			System.out.println("\b");
		}

	}
}