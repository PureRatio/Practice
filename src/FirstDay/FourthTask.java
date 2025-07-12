package FirstDay;

public class FourthTask {
    public static void main(String[] args) {
        int year = 1980;
        int stepSize = 4;
        while(year <= 2020){
            year += stepSize;
            System.out.printf("Олимпиада %d года\n", year);
        }
    }
}
