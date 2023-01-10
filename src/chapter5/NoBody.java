package chapter5;

public class NoBody {
    public static void main(String[] args) {
            int i, j;
            i = 100;
            j = 200;
while(++i < --j) ; // this loop doesn't have a body
System.out.println("average =  " + i);
    }
}
