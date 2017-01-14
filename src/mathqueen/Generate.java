
/**
 * 
 */
package mathqueen;
import static java.lang.System.out;

import java.util.Random;

import mathqueen.Problem;
/**
 * @author Administrator
 *
 */
public class Generate {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		int x = 0;
		while(x < 10)
		{
			int random1 = rand.nextInt(200);
			int random2 = rand.nextInt(200);
			Problem problem = new Problem(random1, random2, 10);
			subtraction(problem.getTerm1(), problem.getTerm2(), Type.SUBSTRACTION.getValue());
			out.print("____________________");
			out.println();
			out.println();
			out.println();
			out.println();
			x++;
		}
		
	}
	public static void subtraction(int num1, int num2, String operator)
	{
		out.println(highest(num1, num2));
		out.print(operator);
		out.println();
		out.println(lowest(num1, num2));
	}
	protected static int highest(int num1, int num2)
	{
		return (num1 < num2) ? num2 : num1;
	}
	protected static int lowest(int num1, int num2)
	{
		return (num1 > num2) ? num2 : num1;
	}

}
