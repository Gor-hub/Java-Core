package homework.medicalCenter;

public interface Commands1 {
    String EXIT1 = "0";
    String NAME = "1";
    String SURNAME = "2";
    String PHONE_NUMER = "3";
    String EMAIL = "4";
    String PROFESSION = "5";

    static void printCommands1() {
        System.out.println("Please input " + EXIT1 + " for exit");
        System.out.println("Please input " + NAME + " for change name");
        System.out.println("Please input " + SURNAME + " for change surname");
        System.out.println("Please input " + PHONE_NUMER + " for change phone number");
        System.out.println("Please input " + EMAIL + " for change email");
        System.out.println("Please input " + PROFESSION + " for change profession");

    }
}
