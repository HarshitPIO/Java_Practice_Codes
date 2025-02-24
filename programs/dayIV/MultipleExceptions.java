package abhyas.dayIV;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10]=30/0;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index values exceeded the limit");
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will still print");
        }
    }
}
