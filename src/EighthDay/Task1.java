package EighthDay;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String numbers = "0";

        for(int i = 1; i <= 20000; i++){
            numbers += " " + i;
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Время выполнения с классом String: %d ms\n", endTime - startTime);
        System.out.println(numbers);

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("0");

        for(int i = 1; i <= 20000; i++){
            stringBuilder.append(" ").append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.printf("Время выполнения с классом StringBuilder: %d ms\n", endTime - startTime);

        System.out.println(stringBuilder);
    }
}
