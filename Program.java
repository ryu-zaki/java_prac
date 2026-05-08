import composite.File;
import composite.FileSystemElement;
import models.DatabaseConnection;
import models.Randomizer;
import composite.Directory;

public class Program {


    public static void main(String[] args) throws InterruptedException {
        // RandomNumber.setIsTest();
        // DatabaseConnection.runThreads();

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        File file4 = new File("file4.txt");
        File file5 = new File("file5.txt");
        Directory dir = new Directory("Documents");

        dir.add(file1);
        dir.add(file2);
        dir.add(file3);

        Directory subDir = new Directory("backups");
        subDir.add(file4);
        subDir.add(file5);

        dir.add(subDir);
        dir.display("");

    }


}