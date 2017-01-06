import static java.lang.System.out;
public class JavaClass 
{
	
	
	
	public static void main(String[] args)
	{
		generate(12,"easy");
	}
	
	public static boolean generate(int numProblems, String difficulty)
	{
		int x = 0;
		while(x < numProblems)
		{
			out.println("printing problem number........." + x);
			x++;
		}
		return true;
	}
	
}

