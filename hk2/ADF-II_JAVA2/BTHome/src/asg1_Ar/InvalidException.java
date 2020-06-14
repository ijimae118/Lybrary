
package asg1_Ar;

/**
 *
 * @author PC
 */
public class InvalidException extends Exception{

    public InvalidException() {
        super("Invalid Data!!!");
    }
    public InvalidException(String error) {
        super(error);
    }
}
