package ProgressBar;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author unilap
 */
public class MediaFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        var ex = FileFilterUtils.getExtension(f);
        if (ex != null) {
            if (ex.equals(FileFilterUtils.MP4) || ex.equals(FileFilterUtils.MP3)
                    || ex.equals(FileFilterUtils.MKV) || ex.equals(FileFilterUtils.M4A)
                    || ex.equals(FileFilterUtils.MVW) || ex.equals(FileFilterUtils.AVI)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "File Media";
    }

}
