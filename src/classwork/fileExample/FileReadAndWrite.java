package classwork.fileExample;

import java.io.*;

import static classwork.fileExample.DataIOStream.read;

public class FileReadAndWrite {
    private static final String FILE_PATH = "D:\\JavaCore\\src\\classwork\\fileExample\\example.txt";
    private static final String NEW_FILE_PATH = "D:\\JavaCore\\src\\classwork\\fileExample\\data.txt";

    public static void main(String[] args) throws IOException {
        write();
        //read();
    }

    private static void write() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(NEW_FILE_PATH))) {
            bufferedWriter.write("Hello From JAVA \r\n");
            bufferedWriter.write("Hello From JAVA line 2!!!!!!!!!!!!!!!!\r\n");
            bufferedWriter.write("Hello From me line 2!!!!!!!!!!!!!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void read() {
//        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
////            String line = "";
////            while ((line = inputStream.readLine()) != null) {
////                System.out.println(line);
////            }
//            int c;
//            while ((c = inputStream.read()) != -1) {
//                System.out.print((char) c);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//}
}

