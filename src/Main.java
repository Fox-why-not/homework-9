import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task-1");
        int[] pay = {2, 3, 4, 7, 8};
        int sum = 0;
for (int elements : pay) {
    sum+= elements;
}
        System.out.println("сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        System.out.println("Task-2");
        int[] waste = {5,7,8,6,7};
        int max = waste[0];
        int min = waste[0];
        for (int j : waste) {
            if (j < min) {
            min = j;
        }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("минимальная сумма трат за неделю составила " + min + " рублей ");
        System.out.println( "максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        System.out.println("Task-3");
        int [] waste2 = {22,854,47,26,74};
        int sum2 = 0;
        for (int i = 0; i < waste2.length; i++) {
            sum2 += waste2[i];
        }
        double avgSum = sum2 / (double) waste2.length;
        System.out.println("средняя сумма трат в месяц составила " + avgSum + " рублей" );
        System.out.println();

        System.out.println("Task-4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}