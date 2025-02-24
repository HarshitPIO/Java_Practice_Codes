package abhyas.dayV.Reccursion;

public class Factorial {
    static int Fact(int x) {
        if(x==1) return 1;
        else return x*Fact(x-1);
    }
    public static void main(String[] args) {
        int c =Fact(5);
        System.out.println(c);
    }
}
