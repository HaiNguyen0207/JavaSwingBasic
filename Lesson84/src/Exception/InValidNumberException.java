
package Exception;

/**
 *
 * @author unilap
 */
public class InValidNumberException extends Exception{
    private String inValidNumber;

    public InValidNumberException() {
    }

    public InValidNumberException(String inValidNumber, String message) {
        super(message);
        this.inValidNumber = inValidNumber;
    }

    public String getInValidNumber() {
        return inValidNumber;
    }

    public void setInValidNumber(String inValidNumber) {
        this.inValidNumber = inValidNumber;
    }
    
}
