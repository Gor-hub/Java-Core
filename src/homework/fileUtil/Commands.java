package homework.fileUtil;

public interface Commands {
    String EXIT = "0";
    String SEARCH_FILE_BY_NAME = "1";
    String SEARCH_FILE_BY_KEYWORD = "2";
    String FIND_LINES = "3";
    String PRINT_SIZE_OF_PACKAGE = "4";
    String CREATE_FILE_WITH_CONTENT = "5";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + SEARCH_FILE_BY_NAME + " for search file by name");
        System.out.println("Please input " + SEARCH_FILE_BY_KEYWORD + " for search file by keyword");
        System.out.println("Please input " + FIND_LINES + " for find lines by keyword");
        System.out.println("Please input " + PRINT_SIZE_OF_PACKAGE + " for print size of package");
        System.out.println("Please input " + CREATE_FILE_WITH_CONTENT + " for create file with content");

    }
}
