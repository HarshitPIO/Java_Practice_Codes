package abhyas.dayXIII;

public class Customer {
    int amount = 10000;
    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing amount");
        if(this.amount< amount) {
            System.out.println("Less balance: waiting for deposit..");
            try {
                wait();
            } catch (Exception e){

            }
        }
        this.amount -= amount;
        System.out.println("Withdraw completed");
        System.out.println("Remaining amount: "+ this.amount);
    }
    synchronized void deposit(int amount) {
        System.out.println("going to deposit");
        ;
        this.amount += amount;
        System.out.println("Deposit completed...");
        System.out.println("updated balance: " + this.amount);
        notifyAll();
    }
}
class Test {
    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread(() -> c.withdraw(15000)).start();
        new Thread(() -> c.withdraw(15000)).start();
        new Thread(() ->  {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
            c.deposit(20000);
        }).start();
    }
}