package app;

public class Main {

    static int count;

    public static void main(String[] args) {
        int sum = 0;

        for (int num = 1; num <= 6; num++) {
            sum += num;
            count++;
            System.out.printf(count + ") Num is %d, sum is %d%n", num, sum );
        }

        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d%n", sum);
    }

}
