package service;

import beans.Files;
import beans.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Goshgar
 */
public class FileService {

    public static void main(String[] args) {

    }

    public static void renameFile(String path, String newName) {
        File f = new File(path);
        String oldname = f.getName();
        if (oldname.endsWith(".txt")) {
            String newpath = path.replace(f.getName(), "");
            f.renameTo(new File(newpath + "\\" + newName + ".txt"));
        }
        if (oldname.endsWith(".mp4")) {
            String newpath = path.replace(f.getName(), "");
            f.renameTo(new File(newpath + "\\" + newName + ".mp4"));
        }
        if (oldname.endsWith(".vcf")) {
            String newpath = path.replace(f.getName(), "");
            f.renameTo(new File(newpath + "\\" + newName + ".vcf"));
        }
        if (oldname.endsWith(".xml")) {
            String newpath = path.replace(f.getName(), "");
            f.renameTo(new File(newpath + "\\" + newName + ".xml"));
        }
        if (oldname.endsWith(".jpg")) {
            String newpath = path.replace(f.getName(), "");
            f.renameTo(new File(newpath + "\\" + newName + ".jpg"));
        } else {
            String newpath = path.replace(f.getName(), "");
            f.renameTo(new File(newpath + "\\" + newName));
        }
    }

}
