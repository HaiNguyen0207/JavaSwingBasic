
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author unilap
 */
public class Student {
    private String name;
    private String id;
    private String major;

    public Student() {
    }

    public Student(String name, String id)
            throws InValidStudentIdException, InValidNameException {
        this.setId(id);
        this.setName(name);
    }

    public Student(String name, String id, String major) 
            throws InValidStudentIdException, InValidNameException{
        this.setName(name);
        this.setId(id);
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) throws  InValidNameException {
        var regex = "^([a-zA-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒ" +
                "ÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ?]+\\s?){2,30}$";
        Pattern pattern;
        pattern = Pattern.compile(regex, Pattern.CANON_EQ
                | Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()) {
            this.name = name ;
        }else {
            throw new InValidNameException("",null);
        }
    }

    public String getId() {
        return id;
    }

    public  void setId(String id) throws InValidStudentIdException {
        var regex="^[(AT || CT || DT )\\d]{8}$";
        Pattern pattern = Pattern.compile(regex,Pattern.CANON_EQ
                | Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(id);
        if(matcher.matches()) {
            this.id = id.toUpperCase();
        }else {
            throw new InValidStudentIdException();
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Student other = (Student) obj;
        return Objects.equals(this.id, other.id);
    }
    
}
