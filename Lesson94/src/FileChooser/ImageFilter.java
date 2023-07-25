package FileChooser;


import FileChooser.FileFilterUtils;
import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author unilap
 */
public class ImageFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        var ex = FileFilterUtils.getExtendtion(f);
        if (ex != null) {
            if (ex.equals(FileFilterUtils.GIF)
                    || ex.equals(FileFilterUtils.PNG)
                    || ex.equals(FileFilterUtils.JPG)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Image files";
    }

}
