package chapter5;

public class SwitchExample {
    public static void main(String[] args) {
        int n = 3;
        int a = 7;
        switch (n) {
            case 1:
                System.out.println("n = 1");
                break;
            case 2:
                System.out.println("n = 2");
            case 8:
                switch (a) {
                    case 1:
                        System.out.println("a = 1");
                        break;
                    case 2:
                        System.out.println("a = 2");
                        break;
                    default:
                        System.out.println("a doesn't exist in these cases");
                        break;
                }
            case 3:
            case 4:
                System.out.println("n = 3 or 4");
                break;
            case 7:
                System.out.println("n = 7");
                break;
            default:
                System.out.println("n doesn't exist in these cases");
                break;
        }
    }
}
