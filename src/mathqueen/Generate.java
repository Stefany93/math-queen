
/**
 * 
 */
package mathqueen;
import static java.lang.System.out;

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
		Problem problem = new Problem(12, 12, 10);
		int x = 0;
		while(x < problem.getNumProblems())
		{
			out.println(problem.getTerm1());
			out.println(Type.SUBSTRACTION.getValue());
			out.println(problem.getTerm2());
			out.println("___");
			out.println();
			out.println();
			
			x++;
		}
		
	}

}
