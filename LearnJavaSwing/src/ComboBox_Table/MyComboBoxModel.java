package ComboBox_Table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author unilap
 */
public class MyComboBoxModel implements ComboBoxModel<String> {

    private List<String> majors;
    private Object selObject;

    public MyComboBoxModel() {
        majors = new ArrayList<>();
        majors.add("Công nghệ thông tin");
        majors.add("An toàn thông tin");
        majors.add("Kế toán");
        majors.add("Điện tử viễn thông");
        majors.add("Cơ khí");
        majors.add("Đa phương tiện ");
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selObject = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selObject;
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
