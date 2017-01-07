

/**
 * 
 */
package mathqueen;
import static java.lang.System.out;
/**
 * @author Administrator
 *
 */
public class Problem {
	int term1;
	int term2;
	int numProblems;
	Problem(int newTerm1, int newTerm2, int newNumProblems)
	{
		 term1 = newTerm1;
		 term2 = newTerm2;
		 numProblems = newNumProblems;
	}
	public int getNumProblems()
	{
		return this.numProblems;
	}
	public String showTerms()
	{
		return  this.term1 + " " + this.term2;
	}
	public int getTerm1()
	{
		return  this.term1;
	}
	public int getTerm2()
	{
		return this.term2;
	}
}
