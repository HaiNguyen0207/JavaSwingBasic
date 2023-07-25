package ProgressBar;

import java.io.File;

/**
 *
 * @author unilap
 */
public class FileFilterUtils {

    static final String MP3 = ".mp3";
    static final String MP4 = ".mp4";
    static final String MKV = ".mkv";
    static final String M4A = ".m4a";
    static final String MVW = ".mvw";
    static final String AVI = ".avi";

    public static String getExtension(File file) {
        String ex = null;
        var endDotIndex = file.getName().lastIndexOf(".");
        if (endDotIndex > 0) {
            ex = file.getName().substring(endDotIndex);
        }
        return ex;
    }
}
