package chapter5;

public class SwitchExample {

    public static void main(String[] args) {
        int n = 9;
        int a = 5;
        switch (n) {
            case 1:
                System.out.println("n-? 1 ?");
                break;
            case 2:
                System.out.println("n-? 2 ?");
                break;
            case 3:
                switch (a) {
                    case 1:
                        System.out.println("a-? ??? ?");
                        break;
                    case 2:
                        System.out.println("a-? 2 ?");
                        break;
                    default:
                        System.out.println("a-? ?? ??? ? ?? ??????");
                }
                break;
            case 4:
                System.out.println("n -? ??? 3 ? ??? 4");
            case 7:
                System.out.println("n-? 7 ?");
                break;
            case 9:
                System.out.println("n-? 9 ?");
                break;
            default:
                System.out.println("n-? ?? 1 ? ?? 2 ? ?? 7");
                break;
        }
    }
}