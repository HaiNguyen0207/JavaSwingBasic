
import Exception.InValidEmailException;
import Exception.InValidNumberException;
import Exception.InValidPasswordException;
import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author unilap
 */
public final class Account implements Serializable{

    private String email;
    private String password;
    private String number;

    protected Account() {
        email = "";
        password = "";
        number = "";
    }

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Account(String email, String password, String number)
            throws InValidEmailException, InValidNumberException, 
            InValidPasswordException {
        this.setEmail(email);
        this.setNumber(number);
        this.setPassword(password);
    }

    

    public String getEmail() {
        return email;
    }

    /**
     * phương thức kiểm tra email có ngoại lệ hay không hợp lệ khi email có 3 kí
     * tự trở lên ,có thể có kí tự chữ , chữ cái ,số ._ và không chứa kí tự đặc
     * biệt
     *
     * @param email cần kiểm tra
     * @throws InValidEmailException ngoại lệ
     */
    public void setEmail(String email) throws InValidEmailException {
        var regex = "^.*[a-zA-Z0-9_.]{3,}@gmail.com.*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            this.email = email;
        } else {
            throw new InValidEmailException();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InValidPasswordException {
       var regex1 = "^(.){6,}$";
        var regex2 = "^.*[a-z]+.*$";
        var regex3 = "^.*[A-Z]+.*$";
        var regex4 = "^.*[0-9]+.*$";
        var regex5 = "^.*[@#$%^&*?/]+.*$";
        Pattern pattern1 = Pattern.compile(regex1);
        var matcher1 = pattern1.matcher(password);

        Pattern pattern2 = Pattern.compile(regex2);
        var matcher2 = pattern2.matcher(password);

        Pattern pattern3 = Pattern.compile(regex3);
        var matcher3 = pattern3.matcher(password);

        Pattern pattern4 = Pattern.compile(regex4);
        var matcher4 = pattern4.matcher(password);

        Pattern pattern5 = Pattern.compile(regex5);
        var matcher5 = pattern5.matcher(password);

        if (matcher1.matches() && matcher2.matches() && matcher3.matches()
                && matcher4.matches() && matcher5.matches()) {
            this.password = password;
        } else {
            throw new InValidPasswordException();
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) throws InValidNumberException {
       var regex = "^(07 ||08 || 03 || 09)\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            this.number = number;
        } else {
            this.number = null;
            throw new InValidNumberException();
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }
}
