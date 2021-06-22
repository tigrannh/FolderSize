import java.io.File;

public class Folder {
    static long size = 0;

    public static void calculateFolderSize(File folder) {
        File[] files = folder.listFiles();
        int count = 0;
        if (files != null) {
            count = files.length;
        }

        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                size = size + files[i].length();
            } else calculateFolderSize(files[i]);
        }
    }


}
