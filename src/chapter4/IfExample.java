package chapter4;

public class IfExample {

    public static void main(String[] args) {
        int a = 45;
        int b = 20;
        int c = 35;

        //        ||
        //   (false || true) -> true
        //   (false || false) -> false
        //  (true || ) -> true
        if (a > b || a > c) {
            System.out.println("a-? ??? ? b-?? ??? c-??");
        }


        //         &&
        //   (true && false) -> false
        //   (false && )  -> false
        //        &
        //   (true & true) -> true
        //   (false & true) -> false
        //   (true & false) -> false
//        if (a > b && a > c) {
//            System.out.println("?-? ??? ? ?-?? ? ?-???");
//        }
    }

}