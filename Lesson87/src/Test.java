
import java.util.Scanner;

/**
 *
 * @author unilap
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        var input= new Scanner(System.in);
        System.out.println("Nhập họ và tên : ");
        var name = input.nextLine();
        try {
            student.setName(name);
        } catch (InValidNameException ex) {
        }
        System.out.println(student.getName());
    }
}
