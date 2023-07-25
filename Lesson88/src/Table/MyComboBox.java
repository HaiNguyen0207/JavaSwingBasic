
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author unilap
 */
public class MyComboBox implements ComboBoxModel<String> {

    private List<String> majors;
    private Object slectedObject;

    public MyComboBox() {
        majors = new ArrayList<>();
        majors.add("Công Nghệ Thông Tin");
        majors.add("An Toàn Thông Tin");
        majors.add("Điện tử viễn thông");
        majors.add("Tài Chính");
        majors.add("Đa phương tiện");
        majors.add("Kế Toán");

    }

    @Override
    public void setSelectedItem(Object anItem) {
        slectedObject =anItem;
    }

    @Override
    public Object getSelectedItem() {
        return slectedObject;
    }

    @Override
    public int getSize() {
        return majors.size();
    }

    @Override
    public String getElementAt(int index) {
        return majors.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

    

}
