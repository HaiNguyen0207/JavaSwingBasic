package JDialogForm;


public class InValidNameException extends  Exception{
    private String inValidName;

    public InValidNameException() {
    }

    public InValidNameException(String inValidName) {
        this.inValidName = inValidName;
    }

    public InValidNameException(String inValidName, String message) {
        super(message);
        this.inValidName = inValidName;
    }

    public String getInValidName() {
        return inValidName;
    }

    public void setInValidName(String inValidName) {
        this.inValidName = inValidName;
    }
    
    
}
