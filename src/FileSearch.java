import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class FileSearch {
  public static void main(String[] args) {
    String startDir = "C:/"; // Directory where file should be searched
    String targetFile = "example.txt"; // File to be searched
    File result = searchFileUsingBFS(startDir, targetFile);
    if (result != null) {
      System.out.println("File found at: " + result.getAbsolutePath());
    } else {
      System.out.println("File not found.");
    }
  }

  public static File searchFileUsingBFS(String startDir, String targetFile) {
    Queue<File> queue = new LinkedList<>();
    queue.add(new File(startDir));
    while (!queue.isEmpty()) {
      File current = queue.poll();
      if (current.isDirectory()) {
        File[] files = current.listFiles();
        if (files != null) {
          for (File file : files) {
            if (file.isDirectory()) {
              queue.add(file);
            } else if (file.getName().equals(targetFile)) {
              return file;
            }
          }
        }
      }
    }
    return null;
  }
}
