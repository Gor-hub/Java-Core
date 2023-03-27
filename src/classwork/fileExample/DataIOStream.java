package classwork.fileExample;

import java.io.*;

public class DataIOStream {
    private static final String FILE_PATH = "D:\\JavaCore\\src\\classwork\\fileExample\\example.txt";

    public static void main(String[] args) throws IOException {
        //write();
        read();

    }
//
//    public static void write() throws IOException {
//        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(FILE_PATH));
//        outputStream.writeInt(33);
//        outputStream.writeBoolean(false);
//        outputStream.writeUTF("Hello");
//        outputStream.close();
//    }

    public static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readUTF());
        inputStream.close();
    }
}
