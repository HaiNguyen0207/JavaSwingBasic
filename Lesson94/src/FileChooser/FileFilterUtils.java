package FileChooser;

import java.io.File;

/**
 *
 * @author unilap
 */
public class FileFilterUtils {

    static final String PNG = ".png";
    static final String GIF = ".gif";
    static final String JPG = ".jpg";

    public static String getExtendtion(File file) {
        String ex = null;
        var endDotIndex = file.getName().lastIndexOf(".");
        if (endDotIndex > 0) {
            ex = file.getName().substring(endDotIndex);
        }
        return ex;
    }
}
