package abhyas.dayII;
class CtPolymorphismExample {
    int multiply(int a, int b) {
        return a*b;
    }
    double multiply (double a, double b) {
        return a*b;
    }
    public static void main(String[] args) {
        CtPolymorphismExample obj = new CtPolymorphismExample();
        System.out.println(obj.multiply(2,5));
        System.out.println(obj.multiply(2.5,4));
    }
}

