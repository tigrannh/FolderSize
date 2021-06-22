import java.util.Scanner;

public class FThread extends Thread {
    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        String file = s.nextLine();
        FolderThread t = new FolderThread(file);
        t.start();

        while (t.isAlive()) {
            try {
                System.out.println(Folder.size + " bytes");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Folder.size + " bytes");
        s.close();
    }
}
