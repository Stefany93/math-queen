/**
 * 
 */
package mathqueen;

/**
 * @author Administrator
 *
 */
public enum Type {
		ADDTION("+"),
		SUBSTRACTION("-"),
		MULTIPLICATION("*"),
		DIVISION("/");
		private final String value;
		    private Type(String value) {
		        this.value = value;
		    }

		    public String getValue() {
		        return value;
		    }
}
