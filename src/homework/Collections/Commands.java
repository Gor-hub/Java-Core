package homework.Collections;

public interface Commands {
    String EXIT = "0";
    String CHECK_NAME = "1";
    String REMOVE_NAME = "2";
    String ADD_NAME_BY_INDEX = "3";

    static void printCommands(){
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + CHECK_NAME + " for checkElementsOfArray name");
        System.out.println("Please input " + REMOVE_NAME + " for remove name");
        System.out.println("Please input " + ADD_NAME_BY_INDEX + " for add name by index");
    }
}
