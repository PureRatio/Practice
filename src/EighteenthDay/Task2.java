package EighteenthDay;

public class Task2 {
    public static void main(String[] args) {
        int num = 717771237;
        System.out.println(count7(num));
    }

    public static int count7(int num) {
        int isSeven = num % 10 == 7 ? 1 : 0;
        if(num > 9){
            return count7(num/10) + isSeven;
        }
        return isSeven;
    }
}
