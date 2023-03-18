package classwork.fileExample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String propertyForDirectory = "D:\\JavaCore\\src\\homework\\file";
        File fileDirectory = new File(propertyForDirectory);
        if (!fileDirectory.exists()){
            boolean created = fileDirectory.mkdir();
            if (created){
                System.out.println("The folder was created successfully");
            }else {
                System.out.println("Failed to create folder");
            }
        }else {
            System.out.println("The folder already exists");
        }

//        String property = System.getProperty("user.dir");
//        System.out.println(property);
//        String directoryPath = "D:\\JavaCore\\src\\classwork\\fileExample\\PetrosFolder\\folder1\\folder2\\folder3";
//        String path = "D:\\JavaCore\\src\\classwork\\fileExample\\data1.txt";
//        File file = new File(path);
//        long usableSpace = file.getUsableSpace();
//        System.out.println("unusable place: " + usableSpace);
//        long lastModified = file.lastModified();
//        System.out.println("last modified: " + lastModified);
//        Date date = new Date();
//        System.out.println("last modified date: " + date);
//        String newPath = "D:\\JavaCore\\src\\classwork\\fileExample\\example.txt";
//        File newFile = new File(newPath);
//        file.renameTo(newFile);
//        System.out.println(newFile.getName());


//        System.out.println("isDirectory " + file.isDirectory());
//        System.out.println("isFile " + file.isFile());
//        System.out.println("file size: " + file.length());
//        File directory = new File(directoryPath);
//        if (!directory.exists()){
//            directory.mkdir();
//        }
//        String[] list = directory.list();
//        for (String s : list) {
//            System.out.println(s);
//        }
//        System.out.println("______________________");

//        File[] listOfFiles = directory.listFiles();
//        for (File f : listOfFiles) {
//            if (f.isFile()) {
//                System.out.print("name: " + f.getName());
//                System.out.println(" | size: " + f.length());
//            }
//        }
//        if (!directory.canWrite()){
//            directory.setExecutable(true);
//        }
//        boolean newFile = file.createNewFile();
//        if (newFile) {
//            System.out.println("file created");
//        } else {
//            System.out.println("file not created");
//        }
    }
}
