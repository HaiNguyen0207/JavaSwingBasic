/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Redo;

import java.io.File;

/**
 *
 * @author unilap
 */
public class FileFilterInValid {
    static final String MP3 = ".mp3";
    static final String MP4 = ".mp4";
    static final String MKV = ".mkv";
    static final String M4A = ".m4a";
    static final String MVW = ".mvw";
    static final String AVI = ".avi";
    public  static  String getExtension(File file) {
        String ex = null;
        if(file.getName().lastIndexOf(".") >0) {
            ex = file.getName().substring(file.getName().lastIndexOf("."));
        }
        return ex ;
    }
}
