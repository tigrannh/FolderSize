import java.io.File;

public class FolderThread extends Thread {
    File file;

    public FolderThread(String file) {
        this.file = new File(file);
    }

    @Override
    public void run() {
        Folder.calculateFolderSize(file);
    }
}
