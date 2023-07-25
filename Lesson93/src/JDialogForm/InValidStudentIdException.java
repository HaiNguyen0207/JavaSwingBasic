package JDialogForm;



/**
 *
 * @author unilap
 */
public class InValidStudentIdException extends Exception{
    private String inValidStudentId;

    public InValidStudentIdException() {
    }

    public InValidStudentIdException(String inValidStudentId, String message) {
        super(message);
        this.inValidStudentId = inValidStudentId;
    }

    public String getInValidStudentId() {
        return inValidStudentId;
    }

    public void setInValidStudentId(String inValidStudentId) {
        this.inValidStudentId = inValidStudentId;
    }
    
}
