package chapter3;

// ?????????????????? ??????? ????????? ????? ????
class Scope {
    public static void main(String[] args) {
        int x; // ??? ?????????? ???????? ?????
//???? ?? ?????? main()
        x = 10;
        if (x == 10) { // ?????? ????? ??????? ????????,
            int y = 20; //????????? ?????? ????? ????? ????
// ??? ?????????? ? ? ? ???????? ?
//???? ??????? ????????
            System.out.println("x ? ?: " + x + " " + y);
            x = y * 2;
        }
//?= 100; //??????! ?????????? ? ??????????
        // ? ???? ??????? ????????, ????? ???
//?????????? ? ???????? ? ?????
        System.out.println("x ????? " + x);
    }
}