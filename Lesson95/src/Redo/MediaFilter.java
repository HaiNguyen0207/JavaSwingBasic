/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redo;

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
        var ex = FileFilterInValid.getExtension(f);
        if (ex != null) {
            if (ex.equals(FileFilterInValid.MP3)
                    || ex.equals(FileFilterInValid.MP4)
                    || ex.equals(FileFilterInValid.MKV)
                    || ex.equals(FileFilterInValid.M4A)
                    || ex.equals(FileFilterInValid.MVW)
                    || ex.equals(FileFilterInValid.AVI)) {
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
