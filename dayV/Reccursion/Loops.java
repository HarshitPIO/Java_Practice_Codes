package abhyas.dayV.Reccursion;

public class Loops {
    static int fun(int a) {
        if(a==0) return 1;
        else {
            System.out.println(a);
           return a=fun(a-1);
        }
    }

    public static void main(String[] args) {
        int c= fun(5);
//        System.out.println(c);
    }
}

