package Exception;

/**
 *
 * @author unilap
 */
public class InValidEmailException extends Exception {

    private String inValidEmail;

    public InValidEmailException() {
    }

    public InValidEmailException(String inValidEmail, String message) {
        super(message);
        this.inValidEmail = inValidEmail;
    }

    public String getInValidEmail() {
        return inValidEmail;
    }

    public void setInValidEmail(String inValidEmail) {
        this.inValidEmail = inValidEmail;
    }

}
