package chapter7.box;

public class Box {

    public final static int WARRANTY_YEAR = 4;

    double width;
    double height;
    double depth;


    static void printMadeIn() {
        System.out.println("Made in Armenia");
        System.out.println("Warranty: " + WARRANTY_YEAR + " year");
    }
}