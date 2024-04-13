package file_exercise;

import java.io.File;

public class FileSearch {
    public static void main(String[] args) {
      
        if (args.length != 2) {
            System.out.println("Usage: java FileSearch <directory> <file_extension>");
            return;
        }
        
        String directoryPath = args[0];
        String fileExtension = args[1];
        
        File directory = new File(directoryPath);
        
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path: " + directoryPath);
            return;
        }
        
        File[] files = directory.listFiles();
        
        System.out.println("Files with extension ." + fileExtension + " in directory " + directoryPath + ":");
        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith("." + fileExtension.toLowerCase())) {
                System.out.println(file.getName());
            }
        }
    }
}