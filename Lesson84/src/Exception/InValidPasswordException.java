package Exception;

/**
 *
 * @author unilap
 */
public class InValidPasswordException extends Exception {

    private String inValidNumber;

    public InValidPasswordException() {
    }

    public InValidPasswordException(String inValidNumber, String message) {
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
