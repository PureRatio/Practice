package EleventhDay;

public class Warehouse {
    int countOrder;
    int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    @Override
    public String toString() {
        return "Warehouse [countOrder=" + countOrder + ", balance=" + balance + "]";
    }
}
