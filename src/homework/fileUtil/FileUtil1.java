package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil1 implements Commands {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean isTrue = true;
        while (isTrue) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isTrue = false;
                    break;
                case SEARCH_FILE_BY_NAME:
                    fileSearch();
                    break;
                case SEARCH_FILE_BY_KEYWORD:
                    contentSearch();
                    break;
                case FIND_LINES:
                    findLines();
                    break;
                case PRINT_SIZE_OF_PACKAGE:
                    printSizeOfPackage();
                    break;
                case CREATE_FILE_WITH_CONTENT:
                    createFileWithContent();
                    break;
                default:
                    System.out.println("Command does not exist!");
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input name of file");
        String fileName = scanner.nextLine();
        try {
            File file = new File(path);
            File[] list = file.listFiles();
            boolean isFile = false;
            for (File file1 : list) {
                String name = file1.getName();
                if (file1.isFile() && name.equals(fileName)) {
                    isFile = true;
                }
            }
            System.out.println(isFile);
        } catch (NullPointerException e) {
            System.err.println("Path does not exist");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("Please input path of folder");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        try {
            File[] list = file.listFiles();
            boolean isKeyword = false;
            for (File file1 : list) {
                String name = file1.getName();
                if (file1.isFile() && name.contains(".txt")) {
                    if (name.equals(keyword)) {
                        System.out.println(name);
                        isKeyword = true;
                    }
                }
            }
            if (!isKeyword) {
                System.out.println("File with keyword \"" + keyword + "\" does not exist!");
            }
        } catch (NullPointerException e) {
            System.err.println("Path does not exist");
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input path of 'txt' file");
        String txtPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath))) {
            int lineNumber = 0;
            boolean isKeyword = false;
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println("Line " + (++lineNumber) + ": " + line);
                    isKeyword = true;
                }
            }
            if (!isKeyword) {
                System.out.println("Line with keyword \"" + keyword + "\" n does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input path of folder");
        String path = scanner.nextLine();
        File folder = new File(path);
        // tarberak 1
        long usableSpace = folder.getUsableSpace();
        System.out.println(usableSpace);
        // tarberak 2
//        File[] files = folder.listFiles();
//        long fileUsableSpace = 0;
//        for (File file : files) {
//            long tmp = file.getUsableSpace();
//            fileUsableSpace += tmp;
//        }
//        System.out.println(fileUsableSpace);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input a file name");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        String property = path + File.separator + fileName;
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(property))) {
            outputStream.writeUTF(content);
            System.out.println("The path of new file: " + property);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
